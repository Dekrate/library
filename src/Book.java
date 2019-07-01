public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;
    String binding;

    Book(String title, String author, int releaseDate, int pages, String publisher, String binding, String isbn){
        this(title, author, releaseDate, pages, publisher, binding);
        this.isbn = isbn;
    }
    Book(String title, String author, int releaseDate, int pages, String publisher, String binding){
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
        this.binding  = binding;
    }

    void printInfo(){
        String info = title+" "+author+" "+releaseDate+" "+pages+" "+publisher+" "+binding+" "+isbn;
        System.out.println(info);
    }

}
