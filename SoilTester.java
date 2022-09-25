class SoilTester{
	public static void main(String[] args)
	{
		Soil.setSoilName("sand");
		Soil.setSoilType("river sand");
		Soil.setSoilColor("orange");
		
		System.out.println("soil name is: "+Soil.getSoilName());
		System.out.println("the soil type is: "+Soil.getSoilType());
		System.out.println("the soil color is: "+Soil.getSoilColor());
	}
}