package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class AeroplaneDto {
	@Id
	@Column(name="id")
	private int id;
	@Size(min=3,max=20,message = "company Name should more then 3 and less than 20")
	private String companyName;
	@Size(min=3,max=20,message = "val name should more then 3 and less than 20")
	private String name;
	@NotNull(message = "Cost not be blank")
	private Integer cost;
	@NotNull(message = "type not be blank")
	private String type;
	@NotNull(message = "country not be blank")
	private String country;


	
}
