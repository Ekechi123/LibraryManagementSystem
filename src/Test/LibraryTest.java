package Test;

import Books.Fiction;
import Books.NonFiction;
import Members.Member;
import Staff.Staff;
import Library.Library;

public class LibraryTest {
    public static void main(String[] args) {
        // Create books
        Fiction fictionBook = new Fiction("The Great Gatsby", "F. Scott Fitzgerald", "123456");
        NonFiction nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", "654321");

        // Create library
        Library library = new Library();

        // Create staff
        Staff staffMember = new Staff("John Doe", "S123");
        staffMember.registerBook(library, fictionBook);
        staffMember.registerBook(library, nonFictionBook);

        // Create member
        Member member = new Member("Jane Smith", "M456");
        staffMember.registerMember(library, member);

        // List all books, members, and staff
        library.listBooks();
        library.listMembers();
        library.listStaff();
    }
}
