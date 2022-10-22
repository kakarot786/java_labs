import java.util.*;

class lab_task_1 {
	public static void main(String[] args){
              // Making a New Object For Taking User Input.
		Scanner obj = new Scanner(System.in);
              // Taking User Input.
		System.out.println("Enter Any Number: ");
		int num = obj.nextInt();
              // Applying Logic.
		if(num%2 == 0)
		{
			System.out.println("Number is Even");
		}
		else
			System.out.println("Number is Odd");
			
	}
}
