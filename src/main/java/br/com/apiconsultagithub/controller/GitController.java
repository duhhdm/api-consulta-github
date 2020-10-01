package br.com.apiconsultagithub.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiconsultagithub.model.ResponseModel;
import br.com.apiconsultagithub.service.TwitterService;

@RestController
@RequestMapping(value="/")
public class GitController {
	
	@Autowired
	private TwitterService serviceTwitter;
	
	Logger log = LoggerFactory.getLogger(GitController.class);
	
	@RequestMapping(value="/consultaTwitter")
	public ResponseEntity<?> consultaTwitter(@RequestParam("parametro")String parametro) {
		log.info("Inicio de consulta para o parametro -> "+ parametro + " no dia -> " + System.currentTimeMillis());
		List<ResponseModel> retorno = new ArrayList<>();
		try {
			retorno = serviceTwitter.buscarTweet(parametro);
			System.out.println(retorno);
			System.out.println(retorno.size());
			if(retorno.isEmpty()) {
				log.info("Consulta retornou vazia para o parametro -> " + parametro + " no dia -> " + System.currentTimeMillis());
				return ResponseEntity.noContent().build();
			}else {
				log.info("Fim da consulta para o parametro -> " + parametro + " no dia -> " + System.currentTimeMillis());
				return ResponseEntity.ok(retorno);
			}
			
		}
		catch(Exception e) {
			log.error("Fim da consulta para o parametro -> " + parametro + " no dia -> "
					+ System.currentTimeMillis() 
					+ " Exception -> " + e.getMessage());
			return ResponseEntity.badRequest().build();
		}
	}
}
