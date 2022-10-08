import java.util.*;

class lab_task_1 {
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		int num = obj.nextInt();
		if(num%2 == 0)
		{
			System.out.println("Number is Even");
		}
		else
			System.out.println("Number is Odd");
			
	}
}