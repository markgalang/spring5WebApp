package learning.markgalang.spring5WebApp.domain;

import java.util.Set;

public class Books {

    private String title;
    private String isbn;
    private Set<Author> author;

    public Books() {
    }

    public Books(String title, String isbn, Set<Author> author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }
}
