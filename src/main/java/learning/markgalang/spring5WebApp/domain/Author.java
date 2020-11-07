package learning.markgalang.spring5WebApp.domain;

import java.util.Set;

public class Author {

    private String firstName;
    private String lastName;
    private Set<Books> books;

    public Author() {
    }

    public Author(String firstName, String lastName, Set<Books> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }
}
