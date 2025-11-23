package Educative;

import java.util.ArrayList;
import java.util.List;

public class flightProcessor {
    public static void main(String[] args) {
        String input = "UK:US:FedEx:4,UK:FR:Jet1:2,US:UK:RyanAir:8,CA:UK:CanadaAir:8";

        String[] inputArr = input.split(",\\s*");

        for(String flight:inputArr)
        {
            String[] details = flight.split(":");
            for(int i=0;i<details.length;i++)
            {
                String src = details[i];
                String dest = details[i+1];
                int cost = Integer.parseInt(details[i+3]);

            }
        }
    }


}
