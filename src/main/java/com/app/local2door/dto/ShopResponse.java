package com.app.local2door.dto;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ShopResponse implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private  Integer shopid;
	private  String shopName;
	private  String shopAdd;
	private byte[] image;
	
	
}
