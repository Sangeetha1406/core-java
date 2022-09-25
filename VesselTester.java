class VesselTester{
	public static void main(String[] args)
	{
		Vessel.setVName("pressure cooker");
		Vessel.setVType("stainless steel");
		Vessel.setVcost(5000);
		
		System.out.println("vessel name is: "+Vessel.getVName());
		System.out.println("the vessel type is: "+Vessel.getVType());
		System.out.println("the vessel cost: "+Vessel.getVcost());
	}
}