package RAGIntegration;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Hashhash {

    public static void main(String args[]) {
        HashMap<String , String> map = new HashMap<>();
        map.put("Name","Taani");
        map.put("Category","Gymanestic");
        map.put("Range","Shooter");

      //  map.get(1);
        System.out.println( map.getOrDefault("Game","Henna"));
        map.remove("Category");
        for (String s: map.keySet()  ) {
            System.out.println(s);
        }

        for (String s: map.values()  ) {
            System.out.println(s);
        }

        for(Map.Entry<String, String> s: map.entrySet())
        {
            System.out.println(s.getKey()+":"+s.getValue());
        }


    }
}