package Collections.hashing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l","He","lo");
        String dText = "He".concat("llo");
        String eText = "hello";
        List<String> hellos = Arrays.asList(aText,bText,cText,dText,eText);
       // hellos.forEach(s-> System.out.println(s+ ":" +s.hashCode()));
        Set<String> mySet = new HashSet<>(hellos);

        List<Contact> emails = ContactData.getData("email");

        List<Contact> phones = ContactData.getData("phone");
        printData("Phone List",phones);
        printData("emails List",emails);

        int index = emails.indexOf(new Contact("Robin Hood"));
        Contact robinHood = emails.get(index);




    }

    public static void printData(String header, Collection<Contact> contacts)
    {
        System.out.println("---------------------------------------");
        System.out.println(header);
        System.out.println("----------------------------------------");
        contacts.forEach(System.out::println);

    }
   
}
