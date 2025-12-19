package ReBirth;

public class Book {
    int Id;
    String name,author,publisher;
    int quantity;

    public Book(int Id,String name, String author,String publisher,int quantity)
    {
        this.Id = Id;
        this.name = name ;
        this.author = author;
        this.publisher = publisher;
        this.quantity =quantity;
    }
}


