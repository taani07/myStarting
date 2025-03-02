package Educative;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecordProcessor {
    public static void main(String[] args) {
        String input1 = "5,R1,5.60,56564534,45,10,R2,7.80,67667565,78";
       // String input2 = "10,R2,7.80,67667565,78";

        List<Record> record = new ArrayList<>();
        String[] parts = input1.split(",\\s*");
        for(int i=0;i<parts.length;i+=5)
        {
             int inputId = Integer.parseInt(parts[i]);
             String category = parts[i+1];
             double value = Double.parseDouble(parts[i+2]);

             record.add(new Record(inputId,category,value));

        }
        Collections.sort(record);
        for(Record r:record) {
            System.out.println(r);

        }


    }
}
