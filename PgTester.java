class PgTester{
	public static void main(String[] args)
	{
		Pg.setPgName("Kushi pg");
		Pg.setPgType("Girls pg");
		Pg.setPlace("banglore");
		
		System.out.println("pg name is: "+Pg.getPgName());
		System.out.println("the pg type is: "+Pg.getPgType());
		System.out.println("the pg place: "+Pg.getPlace());
	}
}