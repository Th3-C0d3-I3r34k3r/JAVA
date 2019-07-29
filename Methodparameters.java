package Package1;

public class Methodparameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stdname("Vijay");
     //add(100,200);
     int x = add(100,200);
     System.out.println("Addition of two values of X : "+ x);
	  int val = SingleVal(100);
	  System.out.println("Value Of Val is: "+ val);
	
	
	
	}
    public static void Stdname(String name) {
    	
    	System.out.println("Name Of The Student: "+ name);
    	
    }
    
    public static int add(int a, int b) {
    	
    	System.out.println("Addition of two values: "+ (a+b));
    	return (a+b);
    	
    }
    public static int  SingleVal(int x) {
    	System.out.println(x);
    	return (x);
    	//return 0;
    	
    }
}
