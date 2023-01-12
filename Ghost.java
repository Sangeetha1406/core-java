package com.xworkz.things;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {


	private String name;
	private Double height;
	private Type nailLength;
	private boolean isDeath;
	private Integer age;
	private LocalDate birthDate;
	private LocalDate deatDate;
	private String siblings;
	private String bPlace;
	private String deathPlace;
	@Autowired
	@Qualifier("gdress")
	private String dress;
	@Autowired
	@Qualifier("gcolor")
	private String color;
	@Autowired
	@Qualifier("glegs")	
	private boolean legs;
	@Autowired
	@Qualifier("gisghost")	
	private boolean isGhost;
	@Autowired
	@Qualifier("gprecution")	
	private String cause;
	@Autowired
	@Qualifier("greason")
	private String reason;
	@Autowired
	@Qualifier("ggender")
	private Gender gender;
	@Autowired
	@Qualifier("gfam")	
	private Integer fam;
	@Autowired
	@Qualifier("gdeath1")	
	private String death;
	@Autowired
	@Qualifier("gends")	
	private String end;

	@Autowired
	public Ghost(@Qualifier("gname") String name,@Qualifier("gheight") Double height,@Qualifier("gnailLength") Type nailLength,@Qualifier("gisDeath") boolean isDeath, @Qualifier("gage")Integer age,@Qualifier("gbirth") LocalDate birthDate,
			@Qualifier("gdeath")LocalDate deatDate,@Qualifier("gsiblings") String siblings, @Qualifier("gbrtplace")String bPlace,@Qualifier("gdeathplace") String deathPlace) {
		//super();
		this.name = name;
		this.height = height;
		this.nailLength = nailLength;
		this.isDeath = isDeath;
		this.age = age;
		this.birthDate = birthDate;
		this.deatDate = deatDate;
		this.siblings = siblings;
		this.bPlace = bPlace;
		this.deathPlace = deathPlace;
	}
	@Override
	public String toString() {
		return "Ghost [name=" + name + ", height=" + height + ", nailLength=" + nailLength + ", isDeath=" + isDeath
				+ ", age=" + age + ", birthDate=" + birthDate + ", deatDate=" + deatDate + ", siblings=" + siblings
				+ ", bPlace=" + bPlace + ", deathPlace=" + deathPlace + ", dress=" + dress + ", color=" + color
				+ ", legs=" + legs + ", isGhost=" + isGhost + ", cause=" + cause + ", reason=" + reason + ", gender="
				+ gender + ", fam=" + fam + ", death=" + death +  "]";
	}
}








