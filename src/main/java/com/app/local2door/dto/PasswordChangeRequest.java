package com.app.local2door.dto;


import java.io.Serializable;



import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class PasswordChangeRequest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String oldPassword;
	private String newPassword;
	
}
