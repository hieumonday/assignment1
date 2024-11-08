
package arrayExer.ArrayListEx;

import java.util.ArrayList;

public class ex2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("black");
        colors.add("white");
        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
        for(String color:colors){
             System.out.println(color);
        }
    }
    
}
