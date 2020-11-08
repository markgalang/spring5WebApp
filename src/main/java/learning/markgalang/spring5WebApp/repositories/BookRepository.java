package learning.markgalang.spring5WebApp.repositories;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books, Long> {
}
