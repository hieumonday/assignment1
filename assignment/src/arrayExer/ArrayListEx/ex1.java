
package arrayExer.ArrayListEx;

import java.util.ArrayList;
import java.util.Arrays;

public class ex1 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Huy1");
        names.add("Huy2");
        names.add("Huy3");
        System.out.println("name[0]=" + names.get(0));
//remove by object and return Boolean type 
        System.out.println(names.remove("Huy2"));
// remove by index
        System.out.println(names.remove(1));
        System.out.println("names=" + Arrays.toString(names.toArray()));
}

}

//    public static void main(String[] args) {
//        int n;
//        int sum = 0;
//        System.out.println("Nhập vào số nguyên:");
//        Scanner sc = new Scanner(System.in);
//
//        n = sc.nextInt();
// 
//        for (int i = 1; i <= 20; i++) // duyệt tất cả phần tử từ 1-20
//        {
//            System.out.println(n + " x " + i + " = " + n * i);
//        }
//    }
//}
