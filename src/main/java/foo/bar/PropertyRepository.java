package foo.bar;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface PropertyRepository extends CrudRepository<Property,Long> ,PagingAndSortingRepository<Property,Long> {
}
