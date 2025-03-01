import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to be reversed : ");
       String input =  scanner.nextLine();

       StringBuilder sb = new StringBuilder();
       for (int i=input.length()-1;i>=0;i--){
           char c = input.charAt(i);
           sb.append(c);
       }
       System.out.println("Reversed string is : "+ sb.toString());
        scanner.close();
    }
}
