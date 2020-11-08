package learning.markgalang.spring5WebApp.bootstrap;

import learning.markgalang.spring5WebApp.domain.Author;
import learning.markgalang.spring5WebApp.domain.Book;
import learning.markgalang.spring5WebApp.repositories.AuthorRepository;
import learning.markgalang.spring5WebApp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author authorName = new Author("asa", "sdsd" );
        Book bookData = new Book("test", "sdsadas");
        authorName.getBooks().add(bookData);
        bookData.getAuthors().add(authorName);

        authorRepository.save(authorName);
        bookRepository.save(bookData);

        Author authorName1 = new Author("11111", "1212121" );
        Book bookData1 = new Book("12121212", "2121212121");
        authorName.getBooks().add(bookData1);
        bookData.getAuthors().add(authorName1);

        authorRepository.save(authorName1);
        bookRepository.save(bookData1);

        System.out.println("Started in bootstrap");
        System.out.println("Number of books: " + bookRepository.count());
    }
}
