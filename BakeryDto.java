package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="bakery")
public class BakeryDto {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="b_name")
	private String bName;
	
	@Column(name="b_owner")
	private String oName;
	
	@Column(name="b_married")
	private boolean oMarried;
	
	@Column(name="b_wife")
	private String wName;
	
	@Column(name="b_famous")
	private String famous;
	
	@Column(name="b_since")
	private int bSince;
	
}
