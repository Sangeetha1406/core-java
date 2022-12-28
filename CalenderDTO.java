package com.xworkz;

public class CalenderDTO {

	String calName;
	int year;
	String day;
	public String getCalName() {
		return calName;
	}
	public void setCalName(String calName) {
		this.calName = calName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "CalenderDto [calName=" + calName + ", year=" + year + ", day=" + day + "]";
	}
	public CalenderDTO(String calName, int year, String day) {
		super();
		this.calName = calName;
		this.year = year;
		this.day = day;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method from CalenderDTO");
		if(obj != null)
		
			if(obj instanceof CalenderDTO)
			{
				CalenderDTO dto = (CalenderDTO) obj;
				if(dto.calName.equals(this.calName))
				{
					System.out.println("name is matching " +dto.calName);
					return true;
				}
			}
		return false;
			}	
}
