package ReBirth;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceExample {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();
        Book b1 = new Book(101,"Harrison","Yashwant","BPB",8);
        Book b2 = new Book(201,"American","Myham","Harriends",3);
        Book b3 = new Book(301,"American","Henary","jazz",9);
        list.add(b1);
        list.add(b2);
        list.add(b3);

        System.out.println("Original content of list is : ");
        for(Book b:list){
            System.out.println(b.Id+""+b.name+""+b.author+""+b.quantity);
        }

        ListIterator<Book> itr = list.listIterator();
        System.out.println("content in backward is :");
        while(itr.hasNext())
        {
            Book st = (Book)itr.next();
            System.out.println(st.quantity +" "+ st.author+" "+st.name+" "+st.Id);
        }
        
    }
    
}
