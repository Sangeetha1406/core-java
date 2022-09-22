class EmpireHotel
{
	public static void main(String []args)
	{
	  String hotelName="Empirehotel";
      String adress="chikbanavara";
	  String managerNames[]={"akshatha","sush","sumanthu","praveen","supriya"};
	  int noOfManager=5;
	  String typeOfHotel="5 star";
	  String foodMenu[]={"eggChilli","eggKurma","eggBiriyani","egg manchuri","egg burgi","manatan","chiken","chiken biriyani","chiken kurma","chiken chilli","egg kabab","manat soup"};
	  System.out.println("welcome to EmpireHotel");
	  System.out.println("----------");
	  System.out.println("destination: "+adress);
	  System.out.println("the number of manager: "+noOfManager);
	  System.out.println("type of hotel is: "+typeOfHotel);
	  System.out.println("-----------");
	  System.out.println("list of manager names");
	  System.out.println("----------");
	  for(int i=0;i<managerNames.length;i++)
	  {
		System.out.println(managerNames[i]);
	  }
	  System.out.println("----------");
	  System.out.println("List of food menu");
	  System.out.println("----------");
	  for(int j=0;j<foodMenu.length;j++)
	  {
		System.out.println(foodMenu[j]);
	  }
	}
}