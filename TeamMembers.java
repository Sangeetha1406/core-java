class TeamMembers{
	static void getTeamMembers(String[] teamMembers)
	{
		System.out.println("inside getTeamMembers");
		System.out.println("size of team members is  "+teamMembers.length);
		System.out.println("list of teamMembers name");
		System.out.println("********");
		for(int i=0;i<teamMembers.length;i++)
		{
			System.out.println(teamMembers[i]);
		}
		System.out.println("********");
		System.out.println("list ended");	
	}
	
}