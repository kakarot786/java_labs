import java.util.Scanner;

class lab_task_2 {
	public static void main(String[] args){
		float a,b,add,subtract,divide,multiply,modulus;
		Scanner obj = new Scanner(System.in);
              // Taking 2 User Inputs.
		System.out.println("Enter Any 2 Numbers: ");
		a = obj.nextInt();
		b = obj.nextInt();
              // Performing Operations By Operators.
		add = a + b;
		subtract = a - b;
		multiply = a * b;
		divide = a / b;
		modulus = a % b;
              // Printing Out The Results.
		System.out.println("Addition of " + a + " and " + b + " = " + add);
		System.out.println("Subtraction of " + a + " and " + b + " = " + subtract);
		System.out.println("Multiplication of " + a + " and " + b + " = " + multiply);
		System.out.println("Division of " + a + " and " + b + " = " + divide);
		System.out.println("Modulus of " + a + " and " + b + " = " + modulus);
		System.out.println
		("\"Using Relational Operators\"");
		System.out.print("if a is greater than b prints true otherwise false: ");
		System.out.println(a>b);
		System.out.print("if a is greater than or equals to b prints true otherwise false: ");
		System.out.println(a>=b);
		System.out.print("if a is less than b prints true otherwise false: ");
		System.out.println(a<b);
		System.out.print("if a is less than or equals to b prints true otherwise false: ");
		System.out.println(a<=b);
		System.out.print("if a is equals to b prints true otherwise false: ");
		System.out.println(a == b);
		System.out.print("if a is not equals to b prints true otherwise false: ");
		System.out.println(a!=b);
		System.out.println("\"Using Logical Operators\"");
		if(a > 5 && a <10){
			System.out.println("Condition is true in terms of AND operator");
		}
		if(a > 5 || a < 50){
			System.out.println("Condition is true in terms of OR operator");
		}
	}
}
