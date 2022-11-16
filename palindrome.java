import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        String reversed = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String");
        String original = sc.nextLine();
        for(int i = original.length() - 1; i>=0; i--){
            reversed = reversed + original.charAt(i);
        }
        if(reversed.equals(original)){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
        sc.close();
    }
    
}