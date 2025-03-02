import java.io.*;
import java.util.*;

public class Lexicographical {

    public static void main(String[] args) {

       // Scanner sc=new Scanner(System.in);
      //  String a=sc.next();
      //  String b=sc.next();
        String a = "hello";
        String b = "java";
        String c = "welcometojava";
        String s = "abcd efgh ijkl";
        int k = 3;
        twoWordComparison(a,b);
        substringsWithoutSpace(c,k);
        substringsWithSpace(s,k);
    }

    public static void twoWordComparison(String A, String B){
        System.out.println("==================================");
        //For the first line, sum the lengths of A and B
        int sumOfLength = A.length() + B.length();
        System.out.println(sumOfLength);

        String capitilizedA = A.substring(0, 1).toUpperCase()+A.substring(1);
        String capitilizedB = B.substring(0, 1).toUpperCase()+B.substring(1);

        //For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //Capitalize the first letter in  and  and print them on a single line, separated by a space
        System.out.println(capitilizedA +" "+ capitilizedB);
    }

    public static void substringsWithoutSpace(String s,int k){
        System.out.println("==================================");
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        for (int i = 1; i <= s.length() - k; i++) {
            String currentSubstring = s.substring(i, i + k);

            // Compare and update smallest and largest
            if (currentSubstring.compareTo(smallest) < 0) {
                smallest = currentSubstring;
            }
            if (currentSubstring.compareTo(largest) > 0) {
                largest = currentSubstring;
            }
        }

        System.out.println(smallest + "\n" + largest);
    }

    public static void substringsWithSpace(String s,int k){
        System.out.println("==================================");
        System.out.println("string : "+s);
        String r = s.replaceAll(" ","");
        substringsWithoutSpace(r,k);
    }
}



