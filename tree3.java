class tree3
{
	static	tree mommy = new tree(1337, "round", "pink", "sad", "Unfaithful", true, "eggs", false, 80084);
	static	tree daddy = new tree(5, "square", "blue", "happy", "Old Faithful", false, "seeds", true, 93714);
	static	tree baby = mommy.bowchickawowwow(daddy);
	
	public static void main(String[] treestuff)
	{
		System.out.println("Girls have a ... ");
		mommy.grow();
		System.out.println(mommy.toString());
		System.out.println(mommy.seeds);
		System.out.println();
		
		System.out.println("Boys have a ... ");
		daddy.grow();
		System.out.println(daddy.toString());
		System.out.println(daddy.seeds);
		System.out.println();
		
		System.out.println("Babies like to poop and sleep");
		baby.grow();
		System.out.println(baby.toString());
		System.out.println(baby.seeds);
		System.out.println();
		
	}
}