class Pine {
	
	public static void main(String [] d){
	
		tree first = new tree();
			first.name = " Pine ";
			first.howTall = 15;
			first.seeds = "None";
			first.Home2Wildlyfe = true;
			first.isEvergreen = false;
			first.leaves = new leaf[4];
			first.wood = new String[]{"Sticks", "Roots", "Branches", "Trunk"};
			
			first.ChangesDuringSpring(false);
			
			System.out.println(first.leaves[8]);
				
				System.out.println("What is the name of this tree? : " + first.name);
				System.out.println("How many feet is this tree? : " + first.howTall);
				System.out.println(first);
				System.out.println(first.wood[2]);
		
		tree second = new tree();
			second.name = "Oak";
			second.howTall = 20;
			second.seeds = "Sometimes";
			second.Home2Wildlyfe = false;
			second.isEvergreen = false;
			second.leaves = new leaf[42];
			second.wood = new String[]{"Branches", "Roots", "Trunk"};
				
			second.ChangesDuringWinter(true);
				
				System.out.println();
				System.out.println(second);
				System.out.println(second.wood[2]);
		tree third = new tree();
			third.name = "Bamboo";
			third.howTall = 30;
			third.seeds = "Never";
			third.Home2Wildlyfe = false;
			third.isEvergreen = true;
			third.leaves = new leaf[100];
			third.wood = new String[]{"Branches"};
			
				third.grow();
				
		
		System.out.println(third);
		
		tree fourth = new tree(400);
				System.out.println(fourth);
		
		tree fifth = new tree(200, "Small ", " Auburn", " Circle");
				System.out.println(fifth);
		
		
		tree sixth = new tree(300, "Large ", "Red ", " Rectangle", "Ash", true, "Wood", false, 100);
					System.out.println();
					System.out.println(sixth.toString(5));
					System.out.println();
		
		
		
		tree seventh = new tree(142, "Medium ", " Violet"," Maple");
					System.out.println("");
					System.out.println(seventh.bowchickawowwow());
					System.out.println("");
					System.out.println(seventh.toString(6));
					System.out.println("");
					System.out.println(seventh.toString("here"));
					System.out.println("");		
	}
}