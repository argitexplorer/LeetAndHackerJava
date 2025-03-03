
import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch,1);
            }
        }
        for(int i= 0;i<b.length();i++){
            char ch = b.charAt(i);
            if(map.get(ch)==null || map.get(ch)==0){
                //System.out.println("Not Anagrams");
                return false;
            } else {
                map.put(ch, map.get(ch)-1);
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

