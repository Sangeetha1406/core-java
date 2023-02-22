package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="v_table")
public class ValentineEntityTable {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="valentineName")
	private String valentineName;
	@Column(name="mettingPlace")
	private String mettingPlace;
	@Column(name="gift")
	private String gift;
}
