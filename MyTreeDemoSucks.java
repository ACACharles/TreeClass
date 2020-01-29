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
		
		
		tree four = new tree(400);
		
		four.name = "          Another Oak Tree\n";
		four.Home2Wildlyfe = true;
		four.wood = new String[] {"trunk", "branches", "roots"};
		four.seeds = "round";
		four.isEvergreen = false;
		four.howTall = 35;
		
		tree five = new tree(530, "Badass Leaf", "Albino", "Rhombicosidodecahedron");
		
		five.name = "          Baobab Tree\n";
		five.Home2Wildlyfe = true;
		five.wood = new String[] {"trunk", "branches", "roots"};
		five.seeds = "round";
		five.isEvergreen = false;
		five.howTall = 35;
		
		tree six = new tree(780, "Sith Lord", "Null", "Vesica Piscis", "          Dead Vlei\n", false, "Darth", false, 42);
		
		
		System.out.print(first.toString()); {
		System.out.println();
		System.out.println(" OMG VIAGRA IN ACTION!! GROW tree GROW!\n");
		first.grow();
		System.out.print("Tree on viagra! Tree Now " + first.howTall + "ft long."); 
		System.out.println();
		five.ChangesDuringFall(first.isEvergreen);
		System.out.println("\nNext tree: "); 
		System.out.println("_______________________"); 
		
		}
		
		System.out.print(second.toString()); { 
		System.out.println();
		System.out.println("\nNext tree: "); 
		System.out.println("_______________________"); 
		}
		
		System.out.print(third.toString());{ 
		System.out.println();	
		System.out.println("\nNext tree: "); 
		System.out.println("_______________________"); 
		}
		
		System.out.print(four.toString()); {
		System.out.println();
		System.out.println("\nNext tree: "); 
		System.out.println("_______________________"); 
		}
		
		System.out.print(five.toString()); {
		System.out.print(five.toString("leaf"));
		System.out.println();
		System.out.println("\nNext tree: "); 
		System.out.println("_______________________");
		}
		
		System.out.print(six.toString());{
		
		System.out.print(six.toString(9));
		System.out.print(six.toString("leaf"));
		System.out.println();
			}
		
		}		
		
	}
}
	