package Hashmapz;

import java.util.HashMap;

public class findUniqueCharacter {
    public static void main(String[] args) {

    }

    public static Character uniqueChar(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch :str.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:str.toCharArray())
        {
            if(map.get(ch)==1)
            {
                return ch;
            }
        }
        return null;

    }
}
