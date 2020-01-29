class Pine {
	
	public static void main(String [] d){
	
		tree first = new tree();
			first.name = " Pine ";
			first.howTall = 15;
			first.seeds = "None";
			first.Home2Wildlyfe = true;
			first.isEvergreen = true;
			first.leaves = new leaf[0];
			first.wood = new String[]{"Sticks", "Roots", "Branches", "Trunk"};
		
				System.out.println("What is the name of this tree? : " + first.name);
				System.out.println("How many feet is this tree? : " + first.howTall);
				System.out.println(first);
		
		tree second = new tree();
			second.name = "Oak";
			second.howTall = 20;
			second.seeds = "Sometimes";
			second.Home2Wildlyfe = false;
			second.isEvergreen = false;
			second.leaves = new leaf[42];
			second.wood = new String[]{"Branches", "Roots", "Trunk"};
				
				System.out.println(second);
				
		tree third = new tree();
			third.name = "Bamboo";
			third.howTall = 30;
			third.seeds = "Never";
			third.Home2Wildlyfe = false;
			third.isEvergreen = true;
			third.leaves = new leaf[100];
			third.wood = new String[]{"Branches"};
				
				System.out.println(third);	
		
			third.grow();
				
				System.out.println(third);
		
		tree fourth = new tree(400);
			
				System.out.println(fourth);
		
		tree fifth = new tree(200, "La", "Vida", "Loca");
			
				System.out.println(fifth);
		
		tree sixth = new tree(300, "La", "Vida", "Loca", "Shebang", true, "Wood", false, 100);
			
					System.out.println(sixth);
		
	}
}