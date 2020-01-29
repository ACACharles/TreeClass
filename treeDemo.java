class treeDemo
{
	public static void main(String[] aa)
	{
		tree first = new tree();
		
		//System.out.print(first.toString());
		
		first.name = "oak";
		first.Home2Wildlyfe = false;
		first.leaves = new leaf[3];
		first.wood = new String[]{"trunk","branches","roots"};
		first.seeds = "flat";
		first.isEvergreen = false;
		first.howTall = 15;
		
		System.out.println(first);
		
		
	
	
	tree second = new tree();
		
		second.name = "pine";
		second.Home2Wildlyfe = true;
		second.leaves = new leaf[10];
		second.wood = new String[]{"trunk","branches","roots"};
		second.seeds = "flat";
		second.isEvergreen = false;
		second.howTall = 50;
		
		System.out.println(second);
	
	
	tree third = new tree();
		
		third.name = "cactus";
		third.Home2Wildlyfe = false;
		third.leaves = new leaf[0];
		third.wood = new String[]{"trunk","branches","roots"};
		third.seeds = "";
		third.isEvergreen = false;
		third.howTall = 10;
		
		System.out.println(third);
		
		third.grow();
				System.out.println(third);

		
	
	
	
	
	
	
	
	}



}