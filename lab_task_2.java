import java.util.Scanner;

class lab_task_2 {
	public static void main(String[] args){
		float a,b,add,subtract,divide,multiply,modulus;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Any 2 Numbers: ");
		a = obj.nextInt();
		b = obj.nextInt();
		add = a + b;
		subtract = a - b;
		multiply = a * b;
		divide = a / b;
		modulus = a % b;
		System.out.println("Addition of " + a + " and " + b + " = " + add);
		System.out.println("Subtraction of " + a + " and " + b + " = " + subtract);
		System.out.println("Multiplication of " + a + " and " + b + " = " + multiply);
		System.out.println("Division of " + a + " and " + b + " = " + divide);
		System.out.println("Modulus of " + a + " and " + b + " = " + modulus);


	}
}