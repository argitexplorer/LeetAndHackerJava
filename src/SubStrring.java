import java.util.Scanner;

public class SubStrring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String inputString = sc.nextLine();
        int stringLength = inputString.length();

        for(int i=0;i<stringLength;i++){
            for( int j=i+1;j<=stringLength;j++){
                String s = inputString.substring(i,j);
                System.out.println(s);
            }
        }
        sc.close();
    }
}
