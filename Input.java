package Package1;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter an integer Value:");
int User_input= scan.nextInt();
System.out.println("Your Entered Value Is:");
System.out.println(User_input);
/*
 * GETTING FLOAT INPUT
 */
Scanner scan1 = new Scanner(System.in);
System.out.println("Enter a Float Value:");
float User_float_Value = scan1.nextFloat();
System.out.println("Your Entered Float value Is");
System.out.println(User_float_Value);
/*
 * GETTING STRING VALUE:
 */
Scanner scan2 = new Scanner(System.in);
System.out.println("Enter the String values:");
String User_String_Value = scan2.nextLine();
System.out.println(User_String_Value);
	}

}
