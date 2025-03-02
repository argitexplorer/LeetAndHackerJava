import java.io.*;
import java.util.*;

public class Lexicographical {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        //For the first line, sum the lengths of A and B
        int sumOfLength = A.length()+B.length();
        System.out.println(sumOfLength);

        //For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //Capitalize the first letter in  and  and print them on a single line, separated by a space
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));

    }
}



