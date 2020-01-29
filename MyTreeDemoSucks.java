class MyTreeDemoSucks {

	public static void main(String args[]){
	
		tree first = new tree();
		
//		System.out.println(first.toString());
		
		first.name = "Pine:\n";
		first.Home2Wildlyfe = true;
		first.leaves = new leaf[1];
		first.wood = new String[] {"trunk", "branches", "roots"};
		first.seeds = "round";
		first.isEvergreen = true;
		first.howTall = 20;
		
		
		tree second = new tree(); {
		

		
		second.name = "Oak:\n";
		second.Home2Wildlyfe = true;
		second.leaves = new leaf[2];
		second.wood = new String[] {"trunk", "branches", "roots"};
		second.seeds = "ugly";
		second.isEvergreen = false;
		second.howTall = 50;
		
		
		}
		
		
		
		tree third = new tree(); {
		

		
		third.name = "              Maple\n";
		third.Home2Wildlyfe = true;
		third.leaves = new leaf[3];
		third.wood = new String[] {"trunk", "branches", "roots"};
		third.seeds = "round";
		third.isEvergreen = false;
		third.howTall = 20;
		
		System.out.print(first.toString()); {
		System.out.println();
		System.out.println("\nNext tree: "); 
		System.out.println("_______________________"); }
		
		System.out.print(second.toString()); { 
		System.out.println();
		System.out.println("\nNext tree: "); 
		System.out.println("_______________________"); }
		
		System.out.print(third.toString());{ 
		System.out.println();		
		System.out.println("OMG VIAGRA IN ACTION!! GROW tree GROW!\n");
			third.grow();
		System.out.print("Tree on viagra! Tree Now " + third.howTall + "ft long."); }
			System.out.println();
			third.ChangesDuringFall(third.isEvergreen);
			
			
		}
	}
}
	