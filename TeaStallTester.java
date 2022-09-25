class TeaStallTester{
	public static void main(String[] args)
	{
		TeaStall.setTeaStallId(123);
		TeaStall.setItem("ab12");
		TeaStall.setAdress("banglore");
		TeaStall.setContactNo(12345567l);
		
		System.out.println(TeaStall.getTeaStallId()+ " "+TeaStall.getItem()+ " "+TeaStall.getAdress()+ " "+TeaStall.getContactNo());
	
	}

}