public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka";

        Book book1 = new Book();
        book1.title = "W pustyni i w puszczy";
        book1.author = "Henryk Sienkiewicz";
        book1.releaseDate = 2010;
        book1.pages = 256;
        book1.publisher = "Greg";
        book1.isbn = "9788373278190";

        System.out.println(appName);
        System.out.println("Książki w bibliotece");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.releaseDate);
        System.out.println(book1.pages);
        System.out.println(book1.publisher);
        System.out.println(book1.isbn);

    }
}
