import java.util.Scanner;

class lab_task_3 {
	public static void main(String[] args){
		float matric,inter,entry,cpn;
		Scanner obj = new Scanner(System.in);
              // Taking First User Input
		System.out.println("Enter Your Matriculation Marks: ");
		matric = obj.nextFloat();
              // Taking Second User Input
		System.out.println("Enter Your Intermediate Marks: ");
		inter = obj.nextFloat();
              // Taking Third User Input
		System.out.println("Enter Your Entry Test Marks: ");
		entry = obj.nextFloat();
              // Applying Formula
			  float matric_percent = (matric/850)*100;
			  float inter_percent = (inter/1100)*100;
			  float entry_percent = (entry/100)*100;
		cpn = (matric_percent * 10)/100 + (inter_percent * 30)/100 + (entry_percent * 60)/100;
		System.out.println("Your CPN is: " + cpn);
	}
}
