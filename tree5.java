class tree5
{
	public static void main(String[] aa)
	{
	
	
	  tree papa = new tree(12, "large", "brown", "circle", "pine", true, "wood",false, 130);
	  tree mamas = new tree(142, "Medium ", " Violet"," square"," Maple", true,"wood", false,20);
	  tree baby = papa.bowchickawowwow(mamas);
		
	
		System.out.println(papa);
		System.out.println(papa.toString(5));
		System.out.println(papa.toString(" "));
		
		
		System.out.println(mamas);
		System.out.println(mamas.toString(2));
		System.out.println(mamas.toString(" "));
		
		
		System.out.println(baby);
		System.out.println(baby.toString());
		System.out.println(baby.toString());
	}
}