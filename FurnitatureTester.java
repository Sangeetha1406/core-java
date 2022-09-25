class FurnitatureTester{
	public static void main(String[] args)
	{
		Furnitature.setCost(30000);
		Furnitature.setName("bed");
		Furnitature.setColor("white");
		
		System.out.println("furniture name is: "+Furnitature.getName());
		System.out.println("the furnitiure cost is: "+Furnitature.getCost());
		System.out.println("the furnitiure color is: "+Furnitature.getColor());
	}
}