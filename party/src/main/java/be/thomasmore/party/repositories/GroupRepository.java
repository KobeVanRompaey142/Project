package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Groupp;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GroupRepository extends CrudRepository<Groupp, Integer> {
    List<Groupp> findAllBy();
}
