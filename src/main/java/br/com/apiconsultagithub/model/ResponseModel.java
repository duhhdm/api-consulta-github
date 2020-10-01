package br.com.apiconsultagithub.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nomeProjeto;
	private String userNameTwitter;
	private String tweet;
	
	public ResponseModel() {
		
	}
}
