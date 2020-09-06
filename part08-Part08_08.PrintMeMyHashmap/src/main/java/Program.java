
import java.util.ArrayList;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hm = new HashMap<>();
        hm.put("abcd", "jkl");
        hm.put("def", "mno");
        hm.put("ghi", "pqr");
        printKeysWhere(hm, "a");
     //   printValuesOfKeysWhere(hm, "a");

    }

    public static void printKeys(HashMap<String, String> hashmap) {

        System.out.println(hashmap.keySet());

    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {

        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }

        }
//        System.out.print(containKey(hashmap, text));

    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }

        }
//        System.out.println(hashmap.get(containKey(hashmap, text)));
    }

}
