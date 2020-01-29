class treeDemo
{
	public static void main(String args[])
	{
/*	String name;
	boolean Home2Wildlyfe;
	public leaf[] leaves;
	String[] wood;
	String seeds;
	boolean isEvergreen;
	int howTall;
*/

tree OakTree = new tree();

OakTree.name = "OakTree";
OakTree.Home2Wildlyfe = true;
OakTree.leaves = new leaf[1000];
OakTree.wood = new String[]{"roots","trunk","branches"};
OakTree.seeds = "acorns";
OakTree.isEvergreen = false;
OakTree.howTall = 100;

tree PecanTree = new tree();
PecanTree.name = "PecanTree";
PecanTree.Home2Wildlyfe = true;
PecanTree.leaves = new leaf[20];
PecanTree.wood = new String[]{"roots","trunk","branches"};
PecanTree.seeds = "pecans";
PecanTree.isEvergreen = false;
PecanTree.howTall = 144;

tree WalnutTree = new tree();
WalnutTree.name = "WalnutTree";
WalnutTree.Home2Wildlyfe = true;
WalnutTree.leaves = new leaf[200];
WalnutTree.wood = new String[]{"roots","trunk","branches"};
WalnutTree.seeds = "walnuts";
WalnutTree.isEvergreen = true;
WalnutTree.howTall = 50;

System.out.println(OakTree.toString());
System.out.println();
System.out.println(PecanTree.toString());
System.out.println();
System.out.println(WalnutTree.toString());
System.out.println();

OakTree.grow();
System.out.println(OakTree.toString());


OakTree.ChangesDuringWinter(OakTree.isEvergreen);
System.out.println();
OakTree.ChangesDuringSpring(OakTree.isEvergreen);
System.out.println();
OakTree.ChangesDuringSummer(OakTree.isEvergreen);
System.out.println();
OakTree.ChangesDuringFall(OakTree.isEvergreen);
System.out.println();


System.out.println(OakTree);


	

	}

}
	
	