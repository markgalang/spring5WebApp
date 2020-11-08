package learning.markgalang.spring5WebApp.repositories;

import learning.markgalang.spring5WebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
