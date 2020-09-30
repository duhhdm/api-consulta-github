package br.com.apiconsultagithub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class GitController {
	
	@Autowired
	private Twitter twitter;
	
	@RequestMapping(value="/consultaTwitter")
	public List<Tweet> consultaTwitter(@RequestParam("parametro")String parametro) {
//		ResponseEntity<RepositorioGitModel> retorno = null;
		return twitter.searchOperations().search(parametro,5).getTweets();
	}
}
