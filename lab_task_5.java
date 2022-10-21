//Making a program to take login details as input.
import java.util.*;

class lab_task_5{
	public static void main(String[] args){
		int flag = 0, email_yes = 0, password_yes = 0,i;
		char choice;
		//Making a database for the input details to be checked.
		String checker, limit = "1234567",email,password;
		String[][] userinfo = { {"a@gmail.com","01234567"},
								{"b@gmail.com","12345678"},
								{"c@gmail.com","135791113"},
								{"d@gmail.com","24681012"},
								{"e@gmail.com","12442169"}
		};
		Scanner sc = new Scanner(System.in);
		do{
			//Taking email input.
			System.out.println("Enter Your Email Address: ");
			System.out.print("");
			email = sc.nextLine();
			//Taking password input with limitations.
			while(true){
				System.out.println("Enter Your Password: ");
				password = sc.nextLine();
				if(password.length() >= limit.length()){
					break;
				}
				else if(password.length() <= limit.length()){
					System.out.println("Password Must Be Atleast 8 characters! ");
					continue;
				}
			}
			//Checking if the email exists.
			for(i=0;i<5;i++){
				checker = userinfo[i][0];
				if(checker.equalsIgnoreCase(email)){
				flag = 1;
				email_yes = 1;
				break;
				}
			}
			//Checking if the password exists.
			for(i=0;i<5;i++){
				if(flag == 0){
					break;
				}
				checker = userinfo[i][1];
				if(checker.equals(password)){
					password_yes = 1;
					break;
				}
			}
			if(email_yes == 1 && password_yes == 1)
			{
				break;
			}
			else if(email_yes == 1 && password_yes == 0){
				System.out.println("Wrong Password Entered!");
			}
			else{
				System.out.println("Wrong Email or Password Entered! Please Try Again.");
			}
			//Prompting the user if he/her wants to run the program incase of a login failure.
			System.out.println("Would You Like To Try Again?  (y/n)");
			choice = sc.next().charAt(0);
			sc.nextLine();
		}
		while(choice == 'y' || choice == 'Y');
		//Printing the results.
		System.out.println("Welcome To Your Profile.");
	}
}
