package learning.markgalang.spring5WebApp.repositories;

import learning.markgalang.spring5WebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
