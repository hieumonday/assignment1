
package arrayExer.ArrayListEx;


import java.util.ArrayList;
import java.util.Arrays;


public class translate {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(9, 4, 7, 5, 8));
        System.out.println("numbers[]= "+Arrays.toString(numbers.toArray()));
    }
}
