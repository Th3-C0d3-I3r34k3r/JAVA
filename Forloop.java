package Package1;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//              METHOD_1
		
		
	
		int[] Myarray = {10,20,30,40,50};
//for('initialization':'condition':'inc/dec')
for(int index=0;index<= 4;index++)
{
	System.out.println(index +" index value is " +Myarray[index]);
	
}		

System.out.println("\n");
System.out.println("\n");
System.out.println("\n");     
   

//             METHOD_2

int[] MyArray= {10,20,30,40,50};
//for(int element:MyArray)
  // for each loop
for (int element : MyArray) {
	
	System.out.println(element);
	
}// for loop  exits here
	}

}
