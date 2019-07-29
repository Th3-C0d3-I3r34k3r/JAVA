package Package1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter Your Choice:\n");		
Scanner scan = new Scanner(System.in); 
int choice = scan.nextInt();
switch(choice) {
	case 1: 
		System.out.println("You Have Entered 1");
		break;
	case 2:
		System.out.println("You Have Entered 2");
		break;
	case 3:
		System.out.println("You Have Entered 3");
		break;
	
	default: 
		System.out.println("Oops...! Invalid Choice!");
		break;
}
	}

}
