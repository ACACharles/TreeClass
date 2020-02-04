//Comments added by Andrew Biggam on 02/04/2020

class tree8 //This is the class. All methods and variables are contained inside this bad boy.
{
	public static void main(String args[]) //The main method which is the entry point for the application where code begins to execute
	{	//constructs a new tree named LemonTree and sets it's parameters within the ()
		tree LemonTree = new tree(100," elliptical shape", "waxy dark green", " oval","LemonTree",false,"lemon",true,15);
		//constructs a new tree named LimeTree and sets it's parameters within the ()
		tree LimeTree = new tree(250," oblong shape", "medium green", " square","LimeTree",true,"lime",false,20);
		
		System.out.println(LemonTree.seeds); //prints out the LemonTree seeds parameter
		System.out.println(); //prints out a blank line
		System.out.println(LemonTree.toString()); //Prints out the contructed LemonTree
		System.out.println(); //prints out a blank line
		System.out.println(LimeTree.toString()); //Prints out the constructed LimeTree
		System.out.println(); //prints out a blank line
		
		tree Sprite = LemonTree.bowchickawowwow(LimeTree); //This is where LemonTree and LimeTree get nasty and make Sprite
		
		System.out.println(Sprite.toString()); //Prints out the contructed Sprite
		System.out.println(); //prints out a blank line
		System.out.println(Sprite.toString(5)); //Prints out the constructed Sprite with different parameters based on taking in an int
		System.out.println(); //prints out a blank line
		System.out.println(Sprite.toString("What do you do")); //Prints out the contstructed Sprite with parameters based on taking in a string   
		System.out.println(); //prints out a blank line
		System.out.println(Sprite.seeds); //Prints out Sprite's seeds
		
		
	
	
	}
	

}
