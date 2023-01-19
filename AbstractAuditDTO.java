package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class AbstractAuditDTO implements Serializable{

	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private String updatedDate;
	
}
