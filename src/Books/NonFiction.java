package Books;

public class NonFiction extends Book {

    public NonFiction(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public String describe() {
        return "Non-Fiction Book: " + title + " by " + author + ", ISBN: " + isbn;
    }
}
