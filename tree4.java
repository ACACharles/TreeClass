class tree4 {
	public static void main (String [] args) {
		
		tree one = new tree(10, "Small", "Purple", "Circle", "Pine", true, "Wood", true, 19);
			
		tree two = new tree(10, "Medium", "Violet", "Maple", "Bamboo", true, "Not Wood", false, 0);
			System.out.println("");
			System.out.println(two.bowchickawowwow(one));
			System.out.println("");
			System.out.println("");
		tree three = new tree(1234567, "Y", "S", "P", "T", false, "TEA", false, 76544231);
			System.out.println("");
			System.out.println(two.bowchickawowwow(three));	
			System.out.println (three.seeds);
			System.out.println(three.bowchickawowwow(three));
	}
}