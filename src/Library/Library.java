package Library;

import Books.Book;
import Members.Member;
import Staff.Staff;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private ArrayList<Staff> staff;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        staff = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.describe());
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member.describe());
    }

    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
        System.out.println("Staff added: " + staffMember.describe());
    }

    public void listBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book.describe());
        }
    }

    public void listMembers() {
        System.out.println("Members of the library:");
        for (Member member : members) {
            System.out.println(member.describe());
        }
    }

    public void listStaff() {
        System.out.println("Staff of the library:");
        for (Staff staffMember : staff) {
            System.out.println(staffMember.describe());
        }
    }
}

