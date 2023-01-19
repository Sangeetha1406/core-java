package com.xworkz.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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

public class SoldierDTO extends AbstractAuditDTO{
	@NotNull(message = "name is should not be null")
	@NotBlank
	@Size(min=3,max=20)
	private String name;
	@Min(value = 0, message = "id must be greater than zero")
	@Max(1000)
	private int id;
	@NotNull(message = "name is should not be null")
	@NotBlank
	@Size(min=3,max=20)
	private String rank;
	@NotNull(message = "rank is should not be null")
	@NotBlank
	@Size(min=3,max=20)
	private String battallion;
	@NotNull(message = "country is should not be null")
	@NotBlank
	@Size(min=3,max=20)
	private String country;
}
