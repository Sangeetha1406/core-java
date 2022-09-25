class PaintTester{
	public static void main(String[] args)
	{
		Paint.setPaintId(123);
		Paint.setBrandName("asian paint");
		Paint.setColor("pink");
		
		System.out.println(Paint.getPaintId());
		System.out.println(Paint.getBrandName());
	}
}