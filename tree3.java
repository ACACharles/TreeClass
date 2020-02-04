/*Comments added by David
	on this day feb 04 2020
*/
class tree3// creates a class.
{
	static	tree mommy = new tree(1337, "round", "pink", "sad", "Unfaithful", true, "eggs", false, 80084); // creates a tree with 9 parameters.
	static	tree daddy = new tree(5, "square", "blue", "happy", "Old Faithful", false, "seeds", true, 93714);// creates a tree with 9 parameters.
	static	tree baby = mommy.bowchickawowwow(daddy); //creates a tree that inheritance from the two trees added to it.
	
	public static void main(String[] treestuff)//creates a main.
	{
		System.out.println("Girls have a ... ");//prints a string.
		mommy.grow();//Makes tree grow 1 foot.
		System.out.println(mommy.toString());//prints the parameters of the tree.
		System.out.println(mommy.seeds);//prints seed.
		System.out.println();//prints a blank line.
		
		System.out.println("Boys have a ... ");//prints a string.
		daddy.grow();//Makes tree grow 1 foot.
		System.out.println(daddy.toString());//prints the parameters of the tree.
		System.out.println(daddy.seeds);//prints seed.
		System.out.println();//prints an empty line.
		
		System.out.println("Babies like to poop and sleep");//prints a string.
		baby.grow();//Makes tree grow 1 foot.
		System.out.println(baby.toString());//prints  the parameters of the tree.
		System.out.println(baby.seeds);//prints seed.
		System.out.println();//prints an empty line.
		
	}
}