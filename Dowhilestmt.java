package Package1;

import java.util.Scanner;

public class Dowhilestmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the test condition:");

Scanner scan = new Scanner(System.in);

int a = scan.nextInt();

   do  {

		
System.out.println("Enter your Choice:");
Scanner inpt = new Scanner(System.in);
int choice = inpt.nextInt();
	
switch(choice) {
case 1:
	System.out.println("You have Entered: 1");
	break;
case 2: 
	System.out.println("You have Entered: 2");
	break;
default:
	System.out.println("Invalid Input..!");

}//switch stmt end 	


     }while(a == 0); //whuile loop end
System.out.println("Please, Enter a valid Test Condition");

	}

}
