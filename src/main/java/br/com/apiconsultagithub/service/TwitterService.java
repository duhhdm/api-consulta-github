package br.com.apiconsultagithub.service;

import java.util.List;

import br.com.apiconsultagithub.model.ResponseModel;

public interface TwitterService {
	public List<ResponseModel> buscarTweet(String titulo);
}
