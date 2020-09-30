package br.com.apiconsultagithub.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LicenseModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("key")
	String key;
    
    @JsonProperty("name")
    String name;
    
    @JsonProperty("spdx_id")
    String spdxId;
   
    @JsonProperty("url")
    String url;
  
    @JsonProperty("node_id")
    String nodeId;

    public LicenseModel() {
    	
    }
}
