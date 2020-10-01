package br.com.apiconsultagithub.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;

import br.com.apiconsultagithub.model.ResponseModel;
import br.com.apiconsultagithub.service.GitService;
import br.com.apiconsultagithub.service.TwitterService;

@Service
public class TwitterServiceImpl implements TwitterService {

	@Autowired
	private GitService serviceGit;

	@Autowired
	private Twitter twitter;
	
	Logger log = LoggerFactory.getLogger(TwitterServiceImpl.class);

	@Override
	public List<ResponseModel> buscarTweet(String titulo) {

		List<String> listaProjeto = serviceGit.buscaProjetos(titulo);
		List<ResponseModel> retorno = new ArrayList<>();
		
		if (listaProjeto==null)
			return null;

		try {
			for (String projeto : listaProjeto) {
				ResponseModel auxiliar = new ResponseModel();
				List<Tweet> lista = twitter.searchOperations().search(projeto, 1).getTweets();
				for (Tweet tweet : lista) {
					auxiliar.setNomeProjeto(projeto);
					auxiliar.setTweet(tweet.getText());
					auxiliar.setUserNameTwitter(tweet.getFromUser());
					retorno.add(auxiliar);
				}
			}
		} catch (Exception e) {
			log.error("Ocorreu um erro no metodo -> buscarTweet() Exception ->" + e.getMessage());
			return null;
		}
		return retorno;
	}

}
