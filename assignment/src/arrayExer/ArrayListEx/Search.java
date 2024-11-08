
package arrayExer.ArrayListEx;

import java.util.ArrayList; 

public class Search {
    public static void main(String[] args) {
        ArrayList<String> language = new ArrayList<>();
        language.add("Python");
        language.add("C++");
        language.add("Java");
        language.add("JavaScript");
        if(language.contains("Python")){
            System.out.println("Python is in the list.");
        }else{
            System.out.println("Python is not in the list");
        }
    }
}
