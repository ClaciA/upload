package testCases;

public class ComputerStuff {
	public static void main(String[] args) {
		
	
Computable  evenNumFinder= new Computable() {
	public boolean canBeComputed(Integer i, Integer j) {
		//boolean isEven=(i%2==0)&&(i%==0);
		//return isBothEven;
		return(i%2==0)&&(j%2==0);
		
	}
};
Computable evenNumberFinder=(Integer i, Integer j)->{
	return(i%2==0)&&(j%2==0);
	
};

Computable evenNumberFinder2=( i, j)->(i%2==0)&&(j%2==0); 
	boolean isBothEven= evenNumberFinder2.canBeComputed(4,7);
	System.out.println(isBothEven);
	System.out.println(evenNumberFinder2.canBeComputed(4,40));
}
}
@FunctionalInterface
interface Computable{
	boolean canBeComputed(Integer i, Integer j);
}