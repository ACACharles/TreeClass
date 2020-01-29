class Treedemo6 {
	public static void main(String args[]) {
		
		tree first = new tree();
		
		first.name = "stanko";
		first.Home2Wildlyfe = true;
		first.leaves = new leaf[2];
		first.wood = new String[]{"bristle", "thistle", "nestle"};
		first.seeds = "dyson";
		first.isEvergreen = false;
		first.howTall = 50;
		
		tree second = new tree(0);
		
		second.name = "dog";
		second.Home2Wildlyfe = false;
		second.wood = new String[]{"bark", "bite", "legg"};
		second.seeds = "smaller dogs";
		second.isEvergreen = false;
		second.howTall = 1;
		
		tree third = new tree(10, "ever green thing", "nettles", "needles");
		
		third.name = "ever green";
		third.Home2Wildlyfe = true;
		third.seeds = "evergreen";
		third.isEvergreen = true;
		third.howTall = 35;
		
		tree fourth = new tree(1, "jaundice", "corona", "influenza", "bad tree", false, "bad tree seeds",  false, 15);
		
		System.out.print(fourth.bowchickawowwow());
		
		System.out.println(first + "\n");
		
		first.grow();
		first.ChangesDuringFall(first.isEvergreen);
		System.out.println(first + "\n");
		
		first.grow();
		first.ChangesDuringWinter(first.isEvergreen);
		System.out.println(first + "\n");
		
		first.grow();
		first.ChangesDuringSpring(first.isEvergreen);
		System.out.println(first + "\n");
		
		first.grow();
		first.ChangesDuringSummer(first.isEvergreen);
		System.out.println(first + "\n");
		
		System.out.println(third.toString(3 + "\n"));
		
		System.out.println(third.toString("EVA" + "\n"));
	}
}