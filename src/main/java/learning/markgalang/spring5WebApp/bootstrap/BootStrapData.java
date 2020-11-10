package learning.markgalang.spring5WebApp.bootstrap;

import learning.markgalang.spring5WebApp.domain.Author;
import learning.markgalang.spring5WebApp.domain.Book;
import learning.markgalang.spring5WebApp.domain.Publisher;
import learning.markgalang.spring5WebApp.repositories.AuthorRepository;
import learning.markgalang.spring5WebApp.repositories.BookRepository;
import learning.markgalang.spring5WebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();

        publisher.setName("qqqq");
        publisher.setCity("asdasd");

        publisherRepository.save(publisher);
        System.out.println("Publisher Count: " + publisherRepository.count());

        Author authorName = new Author("asa", "sdsd" );
        Book bookData = new Book("test", "sdsadas");
        authorName.getBooks().add(bookData);
        bookData.getAuthors().add(authorName);
        bookData.setPublisher(publisher);
        publisher.getBooks().add(bookData);

        authorRepository.save(authorName);
        bookRepository.save(bookData);
        publisherRepository.save(publisher);


        Author authorName1 = new Author("11111", "1212121" );
        Book bookData1 = new Book("12121212", "2121212121");
        authorName.getBooks().add(bookData1);
        bookData1.getAuthors().add(authorName1);
        bookData1.setPublisher(publisher);
        publisher.getBooks().add(bookData1);


        authorRepository.save(authorName1);
        bookRepository.save(bookData1);

        publisherRepository.save(publisher);

        System.out.println(publisher.getBooks().size());

        System.out.println("Started in bootstrap");
        System.out.println("Number of books: " + bookRepository.count());
    }
}
