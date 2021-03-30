package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Activity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ActivityRepository extends CrudRepository<Activity, Integer> {

    @Query("SELECT a FROM Activity a WHERE " +
            "(:minCapacity IS NULL OR :minCapacity <= a.capacity) AND " +
            "(:maxCapacity IS NULL OR a.capacity <= :maxCapacity) AND " +
            "(:maxDistance IS NULL OR a.distanceFromChiroInKm <= :maxDistance) AND " +
            "(:foodProvided IS NULL OR a.foodProvided = :foodProvided) AND " +
            "(:indoor IS NULL OR a.indoor=:indoor) AND " +
            "(:outdoor IS NULL OR a.outdoor=:outdoor) ")
    List<Activity> findByFilter(@Param("minCapacity") Integer minCapacity,
                             @Param("maxCapacity") Integer maxCapacity,
                             @Param("maxDistance") Integer maxDistance,
                             @Param("foodProvided") Boolean foodProvided,
                             @Param("indoor") Boolean indoor,
                             @Param("outdoor") Boolean outdoor);



}
