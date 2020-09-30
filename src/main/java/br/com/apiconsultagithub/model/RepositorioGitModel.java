package br.com.apiconsultagithub.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RepositorioGitModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("total_count")
	private Integer totalCount;
	
	@JsonProperty("incomplete_results")
	private String incompleteResults;
	
	@JsonProperty("items")
	private List<ItemModel> item;
	
	public RepositorioGitModel() {
		
	}
	
}
