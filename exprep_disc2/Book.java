package exprep_disc2;

public class Book {
    public String title;
    public Library library;
    public static Book last = null;

    public Book(String name) {
        title = name;
        last = this;
        library = null;
    }
    public static String lastBookTitle() {
        return last.title;
    }
    public String getTitle() {
        return title;
    }


    public static void main(String[] args) {

        System.out.println(Library.totalBooks); // Line 3

        /**
         * Only those 2 lines results in error.
         * Reason of line 4 : value of lastBookTitle is null, it gives error rather than printing null.
         * Reason of Line 5 : getTitle() is not a static method, therefore it should be ivoked from an instance.
         */
        // System.out.println(Book.lastBookTitle()); // Line 4
        //  System.out.println(Book.getTitle()); // Line 5

        Book goneGirl = new Book("Gone Girl");
        Book fightClub = new Book("Fight Club");

        System.out.println(goneGirl.title); // Line 10
        System.out.println(Book.lastBookTitle()); // Line 11
        System.out.println(fightClub.lastBookTitle()); // Line 12
        System.out.println(goneGirl.last.title); // Line 13

        Library libraryA = new Library(1);
        Library libraryB = new Library(2);
        libraryA.addBook(goneGirl);

        System.out.println(libraryA.index); // Line 19
        System.out.println(libraryA.totalBooks); // Line 20

        libraryA.totalBooks = 0;
        libraryB.addBook(fightClub);
        libraryB.addBook(goneGirl);

        System.out.println(libraryB.index); // Line 26
        System.out.println(Library.totalBooks); // Line 27
        System.out.println(goneGirl.library.books[0].title); // Line 28
    }
}

class Library {

    public Book[] books;
    public int index;
    public static int totalBooks = 0;

    public Library(int size) {
        books = new Book[size];
        index = 0;
    }
    public void addBook(Book book) {
        books[index] = book;
        index++;
        totalBooks++;
        book.library = this;
    }
}
