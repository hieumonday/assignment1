
package arrayExer.ArrayListEx;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAnElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        numbers.remove(Integer.valueOf(5));
        System.out.println("ArrayList after remove: " +Arrays.toString(numbers.toArray()));
    }
}
