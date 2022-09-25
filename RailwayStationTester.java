class RailwayStationTester{
	public static void main(String[] args)
	{
		RailwayStation.setRName("Banglore");
		RailwayStation.setRTrain("shathabdhi");
		RailwayStation.setRTimings("5.30pm");
		
		System.out.println("Railway Station name is: "+RailwayStation.getRName());
		System.out.println("the train is: "+RailwayStation.getRTrain());
		System.out.println("the train timings is: "+RailwayStation.getRTimings());
	}
}