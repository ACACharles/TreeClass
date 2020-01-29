class Treedemo {
	public static void main(String args[]) {
		
		tree first = new tree();
		
		first.name = "stanko";
		first.Home2Wildlyfe = true;
		first.leaves = new leaf[2];
		first.wood = new String[]{"bristle", "thistle", "nestle"};
		first.seeds = "dyson";
		first.isEvergreen = false;
		first.howTall = 50;
		
		tree second = new tree();
		
		second.name = "dog";
		second.Home2Wildlyfe = false;
		second.leaves = new leaf[0];
		second.wood = new String[]{"bark", "bite", "legg"};
		second.seeds = "smaller dogs";
		second.isEvergreen = false;
		second.howTall = 1;
		
		tree third = new tree();
		
		third.name = "ever green";
		third.Home2Wildlyfe = true;
		third.leaves = new leaf[10];
		third.wood = new String[]{"ever green thing", "nettles", "needles"};
		third.seeds = "evergreen";
		third.isEvergreen = true;
		third.howTall = 35;
		
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
	}
}