package greencity.repositories;

import greencity.entities.Place;
import greencity.entities.enums.PlaceStatus;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Provides an interface to manage {@link Place} entity.
 */
@Repository
public interface PlaceRepo extends JpaRepository<Place, Long> {

    /**
     * Finds all places related to the given {@code PlaceStatus}.
     *
     * @param status to find by.
     * @return a list of places with the given {@code PlaceStatus}.
     */
    List<Place> findPlacesByStatus(PlaceStatus status);
}
