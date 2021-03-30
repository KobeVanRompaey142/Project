package be.thomasmore.party.repositories;

import be.thomasmore.party.model.*;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, Integer> {
    Iterable<News> findByActivity(Activity activity);
}
