package Educative;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("Java","A high level language");
        dictionary.put("C#","Machine level languahe");
        dictionary.put("English","A regional language");

        String meaning = dictionary.get("English");
        System.out.println(meaning);

        //Iterate Over Dictionary
        System.out.println("Dictionary contents :");
        for(Map.Entry<String, String> entry: dictionary.entrySet()){
            System.out.println(entry+" is exist in Dictionary");

        }
        dictionary.containsKey("Java");
        {
            System.out.println("");
        }
    }
}
