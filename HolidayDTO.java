package com.xworkz;

public class HolidayDTO {
	int year;
	String holidayName;
	String month;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getHolidayName() {
		return holidayName;
	}
	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	@Override
	public String toString() {
		return "HolidayDTO [year=" + year + ", holidayName=" + holidayName + ", month=" + month + "]";
	}
	public HolidayDTO(int year, String holidayName, String month) {
		super();
		this.year = year;
		this.holidayName = holidayName;
		this.month = month;
	}
	@Override
	public boolean equals(Object reference) {
		System.out.println("running equals from placeDTO");
		if(reference != null)
		{
			if(reference instanceof HolidayDTO) {
				HolidayDTO dto = (HolidayDTO) reference;
				
				if(dto.month.equals(this.month)) {
					System.out.println("name is matching" + dto.month);
					return true;
				}
			}
		}
		return false;
	}
	
	
	
}
