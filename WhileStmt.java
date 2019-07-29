package Package1;

import java.util.Scanner;

public class WhileStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 0;

while(a<=10)
{
	System.out.println("Enter your Choice:");
	Scanner scan = new Scanner(System.in);
	int choice = scan.nextInt();
	
switch(choice) {

case 1:
	System.out.println("You Have Entered value 1");
	break;
case 2:	
	System.out.println("You Have Entered value 2");
	break;
case 3: 
	System.out.println("You Have Entered value 3");
	break;
default:
	System.out.println("You Have Entered An Invalid Choice");
	break;
	}	
	a++;
  }

	}

}
