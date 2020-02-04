class Tree1{
	public static void main(String args[]){
		tree dog = new tree(20, "bark", "bite", "legg", "dog",
			false, "smaller dogs", false, 1);
		System.out.println(dog.toString());
			
		tree badTree = new tree(1, "jaundice", "corona", "influenza", "bad tree",
			false, "bad tree seeds",  false, 15);
		System.out.println(badTree.toString());
		
		tree godsMistake = dog.bowchickawowwow(badTree);
		System.out.println(godsMistake.toString());
		
		tree godsMistake2 = godsMistake.bowchickawowwow(badTree);
		System.out.println(godsMistake2.toString());
		
		tree godsMistake3 = godsMistake.bowchickawowwow(godsMistake2);
		System.out.println(godsMistake3.toString());
	}
}