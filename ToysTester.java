class ToysTester{
	public static void main(String[] args)
	{
		Toys.setCost(300);
		Toys.setName("Teddy");
		Toys.setColor("red with white");
		
		System.out.println("toys name is: "+Toys.getName());
		System.out.println("the toy cost is: "+Toys.getCost());
		System.out.println("the toy color is: "+Toys.getColor());
	}
}