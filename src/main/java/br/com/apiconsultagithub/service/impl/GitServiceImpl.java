package br.com.apiconsultagithub.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.apiconsultagithub.model.RepositorioGitModel;
import br.com.apiconsultagithub.service.GitService;

@Service
public class GitServiceImpl implements GitService {

	@Value("${api.url}")
	String url;

	Logger log = LoggerFactory.getLogger(GitServiceImpl.class);

	@Override
	public List<String> buscaProjetos(String parametro) {
		ResponseEntity<RepositorioGitModel> consulta = null;
		List<String> retorno = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		try {
			consulta = restTemplate.getForEntity(url + "?q=" + parametro, RepositorioGitModel.class);
			retorno = filtrarConsulta(consulta.getBody());
			if (retorno == null) {
				return null;
			}
		} catch (Exception e) {
			log.error("Ocorreu um erro no metodo -> buscaProjeto() Exception ->" + e.getMessage());
			return null;
		}
		return retorno;
	}

	private List<String> filtrarConsulta(RepositorioGitModel parametro) {

		List<String> retorno = new ArrayList<String>();
		Integer limite = 10;
		try {
			if (parametro.getTotalCount() < limite)
				limite = parametro.getTotalCount();
			for (int count = 0; count < limite; count++) {
				retorno.add(parametro.getItem().get(count).getName());
			}
		} catch (Exception e) {
			log.error("Ocorreu um erro no metodo -> filtrarConsulta() Exception ->" + e.getMessage());
			return null;
		}
		return retorno;

	}
}
