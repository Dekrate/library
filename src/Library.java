public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka";

        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 256, "Greg","Miękka", "97883732781890");
        Book book2 = new Book("Krzyżacy", "Henryk Sienkiewicz", 2018, 600, "Greg","Miękka", "9788373271821");
        Book book3 = new Book("Zemsta", "Aleksander Fredro", 2018, 152, "Greg", "Miękka","9788373271968" );

//        book1.title = "W pustyni i w puszczy";
//        book1.author = "Henryk Sienkiewicz";
//        book1.releaseDate = 2010;
//        book1.pages = 256;
//        book1.publisher = "Greg";
//        book1.isbn = "9788373278190";

        System.out.println(appName);
        System.out.println("Książki w bibliotece");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
//        System.out.println(book1.title);
//        System.out.println(book1.author);
//        System.out.println(book1.releaseDate);
//        System.out.println(book1.pages);
//        System.out.println(book1.publisher);
//        System.out.println(book1.isbn);

    }
}
