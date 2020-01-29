class treeDemo{

	public static void main(String args[]){
	
		
		tree first = new tree();
		
		
		
		first.name = "===== Big Ass tree =====" + "\n";
		first.Home2Wildlyfe = true;
		first.leaves = new leaf[4242];
		first.wood = new String[] {"trunk", "branches", "roots"};
		first.seeds = "round";
		first.isEvergreen = false;
		first.howTall = 55;
	
		
		tree second = new tree();
		
		
		
		second.name = "===== Dead tree =====" + "\n";
		second.Home2Wildlyfe = false;
		second.leaves = new leaf[0];
		second.wood = new String[] {"trunk", "branches", "roots"};
		second.seeds = "round";
		second.isEvergreen = true;
		second.howTall = 10;
	
	
		tree third = new tree();
		
				
		third.name = "===== Sexy Tree =====" + "\n";
		third.Home2Wildlyfe = false;
		third.leaves = new leaf[1];
		third.wood = new String[] {"trunk", "branches", "roots"};
		third.seeds = "round";
		third.isEvergreen = true;
		third.howTall = 69;
	
	System.out.println(first.toString());
	System.out.print("During the Fall Season, "); first.ChangesDuringFall(first.isEvergreen);
	System.out.print("In Winter, "); first.ChangesDuringWinter(first.isEvergreen);
	System.out.print("In Spring time, "); first.ChangesDuringSpring(first.isEvergreen);
	System.out.print("And when Summer hits, "); first.ChangesDuringSummer(first.isEvergreen);
	System.out.println("This tree grows 1 ft every season!"); first.grow();first.grow();first.grow();first.grow();
	System.out.println("This tree is now " + first.howTall + " ft tall.  Damn that is a big ass tree.");
	System.out.println();
	
	System.out.println(second.toString());
	System.out.println("The leaves on this tree do not change");
	System.out.println("This tree does not grow");
	System.out.println("The tree is dead...move on");
	
	System.out.println();
	
	System.out.println(third.toString());
	System.out.println("This here is a sexy ass evergreen.");
	System.out.println("You may age but she does not. No she don't, no she don't  (TM)");
	System.out.println();
	
	//first.grow();first.grow();first.grow();first.grow();first.grow();
	//System.out.println(first.toString());
	//System.out.println();
	
	
	}
}