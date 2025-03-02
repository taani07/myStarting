package Collections.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactData {

    private static final String phoneData = """
            Shivam Brown ,9898242424
            Shivam Lee ,9898242425
            Shirley Wu ,9898242426
            Jason Noah ,9898242427
            Jason Noah ,9898242427
            Bred Phil ,9898242429
            Rachael Green ,9898242423
            Monica Geller ,9898242423
            """;

    private static final String emailData = """
            Shirley Wu, Shirley@gmail.com
            Bred Phil, BredPhil@aws.com
            Rachael Green, RachaelGreen@friends.com
            Ross Geller , RossGeller@friends.com
            Monica Geller , MonicaGeller@friends.com
            Rachael Green, RachaelGreen@tvf.com
            """;
    
    public static List<Contact> getData(String type){
        List<Contact> dataList = new ArrayList<>();
        Scanner sc = new Scanner(type.equals("phone")? phoneData:emailData);
        while(sc.hasNext()){
            String[] data = sc.nextLine().split(",");
            Arrays.asList(data).replaceAll(String::trim);
            if(type.equals("phone"))
            {
                dataList.add(new Contact(data[0],Long.parseLong(data[1])));
            }else if (type.equals("email"))
            {
                dataList.add(new Contact(data[0],data[1]));
            }
        }
        return dataList;
    }



}
