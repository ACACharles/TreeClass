class tree8
{
	public static void main(String args[])
	{
		tree LemonTree = new tree(100," elliptical shape", "waxy dark green", " oval","LemonTree",false,"lemon",true,15);
		
		tree LimeTree = new tree(250," oblong shape", "medium green", " square","LimeTree",true,"lime",false,20);
		
		System.out.println(LemonTree.seeds);
		System.out.println();
		System.out.println(LemonTree.toString());
		System.out.println();
		System.out.println(LimeTree.toString());
		System.out.println();
		
		tree Sprite = LemonTree.bowchickawowwow(LimeTree);
		
		System.out.println(Sprite.toString());
		System.out.println();
		System.out.println(Sprite.toString(5));
		System.out.println();
		System.out.println(Sprite.toString("What do you do"));
		System.out.println();
		System.out.println(Sprite.seeds);
		
		
	
	
	}
	

}