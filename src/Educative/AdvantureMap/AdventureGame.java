package Educative.AdvantureMap;

import java.util.HashMap;
import java.util.Map;

public class AdventureGame {
    private static final String GAME_LOCATION= """
            road,at the end of the road, W: hill, E:well house,S:valley,N:forest
            hill,on top of hill with a view in all directions,N:forest, E:road
            well house,inside a well house for a small spring,W:road,N:lake,S:stream
            valley,in a forest valley beside a tumbling stream,N:road,W:hill,E:stream
            forest,at the edge of a thick dark forest,S:road,E:lake
            lake,by an alpine lake surrounded by wildflowers,W:forest,S:well house
            stream,near a stream with a rocky bed,W:valley, N:well house
            """;


    public static void main(String[] args) {
        Map<String, String> Game = new HashMap<>();
        //to print all the Keys of a HashMap using keySet()method

        Game.put("Ludo","Small");
        Game.put("Snake","Ladle");
        Game.put("Cards","Scroll");
        Game.put("Outdoor","Soccer");

        for(String s:Game.keySet())
        {
            System.out.println(s);
            s.replace("S","s");
            System.out.println(s);
        }


    }



}
