package Collections.hashing;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;

public class MapMain {
    public static void main(String[] args) {
        List<Contact> phones = ContactData.getData("phone");
        List<Contact> emails = ContactData.getData("email");

        List<Contact> fullList = new ArrayList<>(phones);
//        System.out.println("before :"+fullList);
//       // System.out.println(phones);
//
       fullList.addAll(emails);
       fullList.forEach(System.out::println);
//        System.out.println("----------------------------------------");
//
//        System.out.println("fullList after: " + fullList);
//
//        System.out.println("-----------------------------");

        Map<String , Contact> contacts = new HashMap<>();
        for(Contact contact:fullList)
        {
            contacts.put(contact.getName(),contact);
        }

        contacts.forEach((k,v)->System.out.println("key="+k+",value= "+v));

        System.out.println("---------------------------");

        System.out.println(contacts.get("Jason Noah"));

        System.out.println(contacts.get("Travor Noah"));

        Contact defaultContact = new Contact("Vishwa Kalyan");
        System.out.println(contacts.getOrDefault("Shirley Wu",defaultContact));

        System.out.println("-------------------------------");
        contacts.clear();
        for(Contact contact:fullList)
        {
         // Contact cc = contacts.put(contact.getName(), contact);
//          if(contact!=null)
//          {
////              System.out.println("duplicate ="+cc);
////              System.out.println("current ="+contact);
//
//              contacts.put(contact.getName(),contact.mergeContact(cc));
//          }
            //Contact con = contacts.computeIfAbsent(contact.getName(),defaultContact);
        }

        contacts.forEach((k,v)-> System.out.println("Key is="+k+",value is="+v));
        Contact contact = new Contact("Tanishka","tn30877@dal.ca");
         contacts.put("Tanishka Chaturvedi",contact);
        System.out.println(contacts);
        contacts.get("Tanishka");
        System.out.println(contacts.getOrDefault(("Shraddha Kapoor"),contact));
        System.out.println(contacts.get("Tanishka Chaturvedi"));
        Contact contact2 = new Contact("tuktuk");
        System.out.println();
        contacts.forEach((k,v)-> System.out.println("key 2 is="+k+",value 2 is="+v));

        Map<String ,Integer> stockPrice = new HashMap<>();
        stockPrice.put("Hundai", 37);
        stockPrice.put("Jeep",23);
        stockPrice.put("Wagnar",55);
        stockPrice.put("Meta",78);

        System.out.println("Hashmap keys are:");

        Set<String> keys = stockPrice.keySet();
        for(String key :keys){
              System.out.println(key);
        }

        System.out.println("values are");
        Collection<Integer> values = stockPrice.values();
        for(Integer e:values)
        {
            System.out.println(e);
        }

        

        

    }

}
