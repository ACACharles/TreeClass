/*Comments added By Philip
  2/4/2020
  you did good bryce
  */
class tree5//name of class
{
	public static void main(String[] aa)//your main method
	{
	
	
	  tree papa = new tree(12, "large", "brown", "circle", "pine", true, "wood",false, 130); //Creating a new instance of tree called papa and setting the parameters
	  tree mamas = new tree(142, "Medium ", " Violet"," square"," Maple", true,"wood", false,20);//Creating a new instance of tree called mama and setting the parameters
	  tree baby = papa.bowchickawowwow(mamas);//using the method bowchickawowwow which has a constructor in it to create a new instance of tree called baby
		
	
		System.out.println(papa);//Showing the parameters that you constructed to papa earlier
		System.out.println(papa.toString(5));//using toString int parameter to print papa leafs 5 times if i remember correctly
		System.out.println(papa.toString(" "));//using toString String parameter to print papa whatever toString with String parameter
		
		
		System.out.println(mamas);//Showing the parameters that you constructed to mamas earlier
		System.out.println(mamas.toString(2));//using toString int parameter to print mamas leafs 5 times if i remember correctly
		System.out.println(mamas.toString(" "));//using toString String parameter to print mamas whatever toString with String parameter
		
		
		System.out.println(baby);//Showing the parameters that you constructed using the method bowchickawowwow
		System.out.println(baby.toString());//trying to figure out what the hell happened with bowchickawowwow
		System.out.println(baby.toString());//trying to figure out what the hell happened with bowchickawowwow
	}
}
