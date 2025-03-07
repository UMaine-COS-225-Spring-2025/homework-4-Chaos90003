public class LibraryTester {
    public static void main(String[] args) {
        BookShelf BookShelf1 = new BookShelf('O');
        BookShelf BookShelf2 = new BookShelf('T');
        System.out.printf("%s\n", BookShelf1.toString());
        System.out.printf("%s\n", BookShelf2.toString());
        Book book1 = new Book("The Heart of the Betrayed", "Crime");
        Book book2 = new Book("Our Hill of Stars", "Fantasy");
        Book book3 = new Book("One of a kind", "Science Fiction");
        Book book4 = new Book("The Vision of Roses", "Romance");
        System.out.printf("%s\n", book1.toString());
        System.out.printf("%s\n", book2.toString());
        System.out.printf("%s\n", book3.toString());
        System.out.printf("%s\n", book4.toString());

        BookShelf2.addBook(book1.title, book1.genre);
        BookShelf1.addBook(book2.title, book2.genre);
        BookShelf1.addBook(book3.title, book3.genre);
        BookShelf2.addBook(book4.title, book4.genre);

        System.out.println(BookShelf1.toString());
        System.out.println(BookShelf2.toString());
    }
}
