class tree2{
	
	public static void main(String[] args){

tree Male= new tree(70,"Pine","Blue","Stick","Male",
			true,"round", true,40);
			
tree Female= new tree(30,"Oak","Green","Flat","Female",
			false,"narrow", false,10);

tree Sapling = Male.bowchickawowwow(Female);

System.out.println(Male);
System.out.println(Male.toString(1));

System.out.println(Female);
System.out.println(Female.toString(1));

System.out.println(Female.seeds);
//System.out.println(seeds.toString());
}
}