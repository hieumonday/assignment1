package arrayExer.ArrayListEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(9, 4, 7, 5, 8));
        Collections.sort(numbers);
        System.out.print(numbers);
        // Sắp xếp ArrayList theo thứ tự giảm dần
        //Collections.sort(numbers, Collections.reverseOrder());
    }
}
