/*Comments Added By Zach Wallace
Feb 4 2020
This is the truth..*/



class tree4 { //This is setting a tree class
	public static void main (String [] args) { //This is our main
		
		tree one = new tree(10, "Small", "Purple", "Circle", "Pine", true, "Wood", true, 19); //This is creating and setting the values of the tree
			
		tree two = new tree(10, "Medium", "Violet", "Maple", "Bamboo", true, "Not Wood", false, 0); // This is the second tree we are creating
			System.out.println("");// this is a line spacing in cmd
			System.out.println(two.bowchickawowwow(one)); //This is printing a method to create but not really doing anything?
			System.out.println("");// Line spacing
			System.out.println("");// Line spacing
		tree three = new tree(1234567, "Y", "S", "P", "T", false, "TEA", false, 76544231);// This is the third tree created
			System.out.println("");// Line spacing
			System.out.println(two.bowchickawowwow(three));// again with the printing of method? Maybe its showing the tree value instead of creating a new tree? idk
			System.out.println (three.seeds);//this is showing seed details of the third tree
			System.out.println(three.bowchickawowwow(three));// again idk, this may be printing a hypothetical tree
	}
}
