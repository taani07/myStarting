package Educative;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtractProductDetails {
    public static void main(String[] args) {
        String logId = "ProductID=123;Name=Laptop;Price=899.99,ProductID=456;Name=Phone;Price=499.50";
        Map<String,String> map = new HashMap<>();

        List<Map<String, String>> listOfLogs = new ArrayList<>();
        String[] inputArr = logId.split(",");
        for (String value:inputArr) {
            String[] value2 = value.split("=");
            map.put(value2[0],value2[1]);

        }
        listOfLogs.add(map);


    }

    public static List<Map<String,String>> parseCSV(String csv)
    {
        String[] lines = csv.split("\\n");
        String[] headers = lines[0].split(",");
        List<Map<String, String >> result = new ArrayList<>();
        for(int i=0;i< lines.length;i++)
        {
            Map<String, String> row = new HashMap<>();
            String [] values = lines[i].split(",");
            for(int j=0;j< headers.length;j++)
            {
                row.put(headers[j],values[j] );
            }
            result.add(row);

        }
        return result;
    }
}
