package com.app.local2door.dto;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ResponseFile implements Serializable{
	  
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String url;
	  private String type;
	  private long size;
}
