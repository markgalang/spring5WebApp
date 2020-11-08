package learning.markgalang.spring5WebApp.repositories;

import learning.markgalang.spring5WebApp.domain.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books, Long> {
}
