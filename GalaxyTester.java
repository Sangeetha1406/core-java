class GalaxyTester{
	public static void main(String[] args)
	{
		Galaxy.setGName("Spin Galaxy");
		Galaxy.setGType("Milky way");
		Galaxy.setNumberOfStars("2bilion");
		
		System.out.println("Galaxy name is: "+Galaxy.getGName());
		System.out.println("the Galaxy type is: "+Galaxy.getGType());
		System.out.println("the Galaxy number of staars is: "+Galaxy.getNumberOfStars());
	}
}