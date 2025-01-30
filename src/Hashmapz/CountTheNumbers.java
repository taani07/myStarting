package Hashmapz;

import java.util.HashMap;

public class CountTheNumbers {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        Integer[] intTempArray ={1,2,3,2,3,2,5,6,7,7,5,1,1};
        String[] stt = sentence.split(" ");
        HashMap<String,Integer> map = new HashMap<>();

        HashMap<Integer, Integer> map2 = new HashMap<>();

        for(int i :intTempArray)
        {
            map2.put(i,map2.getOrDefault(i,0)+1);
        }

        System.out.println(map2);

        for(String s:stt)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        System.out.println(map);
    }


}
