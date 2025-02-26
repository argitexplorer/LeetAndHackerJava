public class StringReversal {

    public static void main(String[] args) {

        String a = "hello";
        System.out.println("String to be reversed : "+a);
         StringBuilder sb = new StringBuilder();

         for (int i=a.length()-1; i>=0;i--){
             sb.append(a.charAt(i));
         }
        System.out.println("Reversed String : "+ sb.toString());
    }
}



