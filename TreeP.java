class TreeP {

public static void main(String[] args){
	

tree Pine = new tree();

Pine.name = "PineTree";
Pine.Home2Wildlyfe = true;
Pine.leaves = new leaf[1];
Pine.wood = new String[]{"Trunk","Branches","Roots"};
Pine.seeds = "Spikey";
Pine.isEvergreen = true;
Pine.howTall = 30;

System.out.println(Pine);

tree Oak = new tree();

Oak.name = "OakTree";
Oak.Home2Wildlyfe = true;
Oak.leaves = new leaf[1];
Oak.wood = new String[]{"Trunk","Branches","Roots"};
Oak.seeds = "Spikey";
Oak.isEvergreen = true;
Oak.howTall = 40;

tree Birch = new tree();

Birch.name = "BirchTree";
Birch.Home2Wildlyfe = true;
Birch.leaves = new leaf[1];
Birch.wood = new String[]{"Trunk","Branches","Roots"};
Birch.seeds = "Spikey";
Birch.isEvergreen = true;
Birch.howTall = 40;
System.out.println(Oak);
System.out.println(Birch);
Birch.grow();
System.out.println(Birch);
}
}