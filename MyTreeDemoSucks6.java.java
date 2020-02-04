class MyTreeDemoSucks6 {
	public static void main(String args[]){
		
	tree seven = new tree(780, "\nSith Lord\n", "Null", "Vesica Piscis", "          Dead Vlei\n",true , "Darth", true, 42); 
	
	tree eight = new tree(530, "Badass Leaf", "Albino", "Rhombicosidodecahedron", "          Baobab Tree", false , "PewPew", false, 38);
	
	tree nine =	new tree(530, "a", "b", "c", "         d", false , "e",  true, 38);
	
	tree ten = seven.bowchickawowwow(eight);
	
	tree eleven = ten.bowchickawowwow(ten);
	System.out.println(ten.toString());
	System.out.print(ten.seeds);
	System.out.println(eleven.toString(1));
	System.out.println(eleven.toString(""));
	System.out.print(eleven.seeds);
	
	}
}