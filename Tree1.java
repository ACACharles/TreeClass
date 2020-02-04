/* Comments added by Eric Walker
   on February 4, 2020
   This is the truth...*/
class Tree1{ //Class called Tree1
	public static void main(String args[]){ // main method used an the executor for the program
		tree dog = new tree(20, "bark", "bite", "legg", "dog", //constructor using variables int, string, string, string,string
			false, "smaller dogs", false, 1);	       //boolean, string, boolean, int to describe "dog" as a new tree
		System.out.println(dog.toString());	//toString() method to search the index for a specific variable in "dog"
			
		tree badTree = new tree(1, "jaundice", "corona", "influenza", "bad tree", //constructor for "badTree", another instance
			false, "bad tree seeds",  false, 15);				  //of tree with the same variable parameters.
		System.out.println(badTree.toString()); // toString() method used to search "badTree" for a variable
		
		tree godsMistake = dog.bowchickawowwow(badTree); // "godsMistake" is the concatenation of "dog" and "badTree"
		System.out.println(godsMistake.toString());// toString() method to search "godsMistake" for specific variables
		
		tree godsMistake2 = godsMistake.bowchickawowwow(badTree);//"godsMistake2" is the concatenation of "godsMistake" and "badTree"
		System.out.println(godsMistake2.toString());// toString() method to search "godsMistake2" for a variable
		
		tree godsMistake3 = godsMistake.bowchickawowwow(godsMistake2); //"godsMistake3" is the concatenation of "godsMistake" and
		System.out.println(godsMistake3.toString());		       //"godsMistake2"
		//toString() method to search "godsMistake3" for a variable
	}
}
