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
Oak.seeds = "Round";
Oak.isEvergreen = true;
Oak.howTall = 40;

tree Birch = new tree();

Birch.name = "BirchTree";
Birch.Home2Wildlyfe = true;
Birch.leaves = new leaf[1];
Birch.wood = new String[]{"Trunk","Branches","Roots"};
Birch.seeds = "Round";
Birch.isEvergreen = true;
Birch.howTall = 20;

tree Apple = new tree(50);
tree Pear = new tree(50,"type","color","style");
tree Spruce= new tree(50,"type","color","style","Spruce",
			true,"round", true,30);

System.out.println(Spruce);
System.out.println(Pear);
System.out.println(Apple);
System.out.println(Oak);
System.out.println(Birch);
Birch.grow();
System.out.println(Birch);

//public String toString(int ShowTheseLeaves){
//	public String toString(String ShortHand){
}
}