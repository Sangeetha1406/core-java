package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class ValantineDto {
	@Id
	@Column(name="id")
	private int id;
	@Size(min=3,max=20,message = "name should more then 3 and less than 20")
	private String name;
	@Size(min=3,max=20,message = "val name should more then 3 and less than 20")
	private String valentineName;
	@NotNull(message = "plce not be blank")
	private String mettingPlace;
	@NotNull(message = "gift not be blank")
	private String gift;

}
