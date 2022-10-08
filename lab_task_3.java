import java.util.Scanner;

class lab_task_3 {
	public static void main(String[] args){
		float matric,inter,entry,cpn;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Your Matriculation Percentage: ");
		matric = obj.nextInt();
		System.out.println("Enter Your Intermediate Percentage: ");
		inter = obj.nextInt();
		System.out.println("Enter Your Entry Test Percentage: ");
		entry = obj.nextInt();
		cpn = (matric * 10)/100 + (inter * 30)/100 + (entry * 60)/100;
		System.out.println("Your CPN is: " + cpn);
	}
}