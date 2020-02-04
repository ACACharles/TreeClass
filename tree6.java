class MyTreeDemoSucks {

	public static void main(String args[]){
	
		tree first = new tree(); {
	
		first.name = "              Pine Tree:\n";
		first.Home2Wildlyfe = true;
		first.leaves = new leaf[1];
		first.wood = new String[] {"trunk", "branches", "roots"};
		first.seeds = "round";
		first.isEvergreen = true;
		first.howTall = 20;
		}
		
		tree second = new tree(); {
	
		second.name = "              Oak:\n";
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
		}
		
		tree four = new tree(400); {
		
		four.name = "          Another Oak Tree\n";
		four.Home2Wildlyfe = true;
		four.wood = new String[] {"trunk", "branches", "roots"};
		four.seeds = "round";
		four.isEvergreen = false;
		four.howTall = 35;
		}
		
		tree five = new tree(530, "Badass Leaf", "Albino", "Rhombicosidodecahedron"); {
		
		five.name = "          Baobab Tree\n";
		five.Home2Wildlyfe = true;
		five.wood = new String[] {"trunk", "branches", "roots"};
		five.seeds = "round";
		five.isEvergreen = false;
		five.howTall = 35;
		}
		
		tree six = new tree(780, "\nSith Lord\n", "Null", "Vesica Piscis", "          Dead Vlei\n", false, "Darth", false, 42); {}
		
		
		{
		System.out.println("First tree: ");
		System.out.println(first.toString()); 
		System.out.println();
		System.out.println(" OMG VIAGRA IN ACTION!! GROW tree GROW!\n");
		first.grow();
		System.out.print("Tree on viagra! Tree Now " + first.howTall + "ft long."); 
		System.out.println();
		System.out.println("_______________________");
		System.out.println("\nSecond tree: ");  
		}
		
		{
		System.out.print(second.toString()); 
		System.out.println();
		System.out.print("When Tree Angry "); second.ChangesDuringFall(second.isEvergreen);
		System.out.print("When it is cold "); second.ChangesDuringWinter(second.isEvergreen);
		System.out.print("When Two Leaves Love Each Other And Make New Leaves The "); second.ChangesDuringSpring(second.isEvergreen);
		System.out.print("Time Does Indeed Make "); second.ChangesDuringSummer(second.isEvergreen);
		System.out.println("_______________________");
		System.out.println("\nThird tree: "); 
		}
		
		{
		System.out.print(third.toString());
		System.out.println();	
		System.out.print("When Tree Angry ");third.ChangesDuringFall(third.isEvergreen);
		System.out.print("When it is cold ");third.ChangesDuringWinter(third.isEvergreen);
		System.out.print("When Two Leaves Love Each Other And Make New Leaves The "); third.ChangesDuringSpring(third.isEvergreen);
		System.out.print("Time Does Indeed Make "); third.ChangesDuringSummer(third.isEvergreen);
		System.out.println("_______________________");
		System.out.println("\nFourth tree: ");  
		}
		
		{
		System.out.print(four.toString()); 
		System.out.println();
		System.out.print("When Tree Angry "); four.ChangesDuringFall(four.isEvergreen);
		System.out.print("When it is cold "); four.ChangesDuringWinter(four.isEvergreen);
		System.out.print("When Two Leaves Love Each Other And Make New Leaves The "); four.ChangesDuringSpring(four.isEvergreen);
		System.out.print("Time Does Indeed Make "); four.ChangesDuringSummer(four.isEvergreen);
		System.out.println("_______________________");
		System.out.println("\nFifth tree: ");  
		}
		
		{
		System.out.print(five.toString()); 
		System.out.println();
		System.out.print("When Tree Angry ");  five.ChangesDuringFall(five.isEvergreen);
		System.out.print("When it is cold ");  five.ChangesDuringWinter(five.isEvergreen);
		System.out.print("When Two Leaves Love Each Other And Make New Leaves The ");  five.ChangesDuringSpring(five.isEvergreen);
		System.out.print("Time Does Indeed Make "); five.ChangesDuringSummer(five.isEvergreen);
		System.out.println("_______________________");
		System.out.println("\nSixth tree: "); 
		}
		 
		{
		System.out.println(six.toString(1)); 
		System.out.println("_______________________");
		System.out.println(six.toString(""));
		System.out.println("_______________________");
		System.out.println();
		}
	}		
		
}

	