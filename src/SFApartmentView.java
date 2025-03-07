import java.util.LinkedList;

public class SFApartmentView {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(6);
        for (int i = 0; i < list.size(); i++) {
            boolean isGreaterThanAllRight = true;

            // Compare the current element with all elements to its right
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) <= list.get(j)) {
                    isGreaterThanAllRight = false;
                    break; // No need to check further if we already know the element is not greater than all to the right
                }
            }

            // Print True if the current element is greater than all elements to its right, otherwise print False
            if (isGreaterThanAllRight) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
