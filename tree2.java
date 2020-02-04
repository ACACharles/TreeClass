/* Comments added by Bryce
on this day Feb 4 2020
This is the truth..*/


class tree2{ //tree is a solid class name
	
	public static void main(String[] args){ 

tree Male= new tree(70,"Pine","Blue","Stick","Male", // A new male tree that is a Pine with blue leaves. Never seen a blue leaf
			true,"round", true,40);
			
tree Female= new tree(30,"Oak","Green","Flat","Female", // A new female tree that is an Oak with green leaves. Nice
			false,"narrow", false,10);

tree Sapling = Male.bowchickawowwow(Female); //Making a sapling from the Male and Female

System.out.println(Male); //printing out the Male tree
System.out.println(Male.toString(1)); // printing male tree with the options that build it

System.out.println(Female); //printing female tree
System.out.println(Female.toString(1)); // printing female tree with the qualities

System.out.println(Female.seeds); 
//System.out.println(seeds.toString());// commenting on your comment. Trying to print out the seeds
}
}
