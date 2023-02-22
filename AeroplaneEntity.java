package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name="a_table")
public class AeroplaneEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="companyName")
	private String companyName;
	@Column(name="name")
	private String name;
	@Column(name="cost")
	private Integer cost;
	@Column(name="type")
	private String type;
	@Column(name="country")
	private String country;

}
