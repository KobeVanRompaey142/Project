package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Activity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActivityRepository extends CrudRepository<Activity, Integer> {

}
