
package arrayExer.ArrayListEx;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("hcm");
        cities.add("Da Nang");
        cities.add("Nha Trang");
        cities.add("Ha Noi");
        cities.add("Hai Phong");
        cities.add("Quy Nhon");
        for(String city : cities){
            System.out.println(city);
        }
    }
}
