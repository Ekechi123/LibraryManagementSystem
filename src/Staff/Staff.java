package Staff;

import Members.Person;
import Library.Library;
import Books.Book;
import Members.Member;

public class Staff extends Person {

    public Staff(String name, String id) {
        super(name, id);
    }

    @Override
    public String describe() {
        return "Staff: " + name + " with ID: " + id;
    }

    public void registerMember(Library library, Member member) {
        library.addMember(member);
    }

    public void registerBook(Library library, Book book) {
        library.addBook(book);
    }
}
