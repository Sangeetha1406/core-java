class Cricket{
	public static void main(String  args[])
	{
		int rohithhighestScores=264;
		int sachinHighestScore=200;
		int mandanaHighestScore=232;
		int ackerrHigestScore=222;
		int bjclarkHighestScore=229;
		
		int highestScores[]={rohithhighestScores,sachinHighestScore,mandanaHighestScore,ackerrHigestScore,bjclarkHighestScore};
		int ref1=highestScores[0];
		int ref2=highestScores[3];
		System.out.println(ref1);
		System.out.println(ref2);
		System.out.println("---------------------");
		for(int index=0;index<highestScores.length;index++)
		{
			System.out.println(highestScores[index]);
		}
	}
}
		
		