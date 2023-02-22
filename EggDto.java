package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="egg_table")
public class EggDto
{
	
	@Id
	@Column(name="e_id")
	private int id;
	@Column(name="e_hname")
	private String hname;
	@Column(name="e_dname")
	private String dname;
	@Column(name="e_price")
	private Double price;
		
}
