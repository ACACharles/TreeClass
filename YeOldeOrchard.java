class YeOldeOrchard
{
	public static void main(String[] treestuff)
	{
		tree first = new tree();
		tree second = new tree();
		tree third = new tree();
		tree fourth = third.bowchickawowwow();
		
		first.name = "prickly boy";
		first.Home2Wildlyfe = true;
		first.leaves = new leaf[99];
		first.wood = new String[]{"barky boy","branchy boys", "rooters"};
		first.seeds = "some kinda shape";
		first.isEvergreen = true;
		first.howTall = 350;
		
		second.name = "Dinosaur Food";
		second.Home2Wildlyfe = true;
		second.leaves = new leaf[100];
		second.wood = new String[]{"trunk","branchy boys", "rooters"};
		second.seeds = "some kinda shape";
		second.isEvergreen = false;
		second.howTall = 50;
		
		third.name = "A very prickly boy";
		third.Home2Wildlyfe = false;
		third.leaves = new leaf[0];
		third.wood = new String[]{"leg?","arms?", "rooters"};
		third.seeds = "some kinda shape";
		third.isEvergreen = true;
		third.howTall = 10;
		
		fourth.name = "A very prickly boy";
		fourth.Home2Wildlyfe = false;
		fourth.leaves = new leaf[0];
		fourth.wood = new String[]{"stumpy leg?","tiny arms?", "baby rooters"};
		fourth.seeds = "some kinda shape";
		fourth.isEvergreen = true;
		fourth.howTall = 5;
		
		
		System.out.println("Grow thineself!!!");
		first.grow();
		System.out.println(first.toString());
		System.out.println("\nSPRING\nSUMMER\nFALL\nWINTER");
		first.ChangesDuringSummer(false);
		for(leaf L : first.leaves)
			System.out.println(L + ", ");
		System.out.println();
		
		System.out.println("Grow TreeStar Grow!!!");
		second.grow();
		System.out.println(second.toString());
		System.out.println("\nSPRING");
		second.ChangesDuringSpring(false);
		for(leaf L : second.leaves)
			System.out.println(L + ", ");
		System.out.println("\nSUMMER");
		second.ChangesDuringSummer(false);
		for(leaf L : second.leaves)
			System.out.println(L + ", ");
		System.out.println("\nFALL");
		second.ChangesDuringFall(false);
		for(leaf L : second.leaves)
			System.out.println(L + ", ");
		System.out.println("\nWINTER");
		second.ChangesDuringWinter(false);
		for(leaf L : second.leaves)
			System.out.println(L + ", ");
		System.out.println();
		
		System.out.println("Grow cactaur Grow!!!");
		third.grow();
		System.out.println(third.toString());
		System.out.println();
		
		System.out.println("Grow baby cactaur Grow!!!");
		fourth.grow();
		System.out.println(fourth.toString());
	}
}