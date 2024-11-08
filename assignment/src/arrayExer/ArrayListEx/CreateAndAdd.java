
package arrayExer.ArrayListEx;

import java.util.ArrayList;


public class CreateAndAdd {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("phong");
        friends.add("phu");
        friends.add("duc");
        friends.add("doan");
        friends.add("ngoc");
        for (int i=0;i<friends.size();i++){
          System.out.println(friends.get(i));
        }
               
    }
}
