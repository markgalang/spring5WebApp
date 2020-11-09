package learning.markgalang.spring5WebApp.repositories;

import learning.markgalang.spring5WebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
