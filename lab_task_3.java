import java.util.Scanner;

class lab_task_3 {
	public static void main(String[] args){
		float matric,inter,entry,cpn;
		Scanner obj = new Scanner(System.in);
              // Taking First User Input
		System.out.println("Enter Your Matriculation Percentage: ");
		matric = obj.nextFloat();
              // Taking Second User Input
		System.out.println("Enter Your Intermediate Percentage: ");
		inter = obj.nextFloat();
              // Taking Third User Input
		System.out.println("Enter Your Entry Test Percentage: ");
		entry = obj.nextFloat();
              // Applying Formula
		cpn = (matric * 10)/100 + (inter * 30)/100 + (entry * 60)/100;
		System.out.println("Your CPN is: " + cpn);
	}
}
