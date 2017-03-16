package pl.ajn.combo.customers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pl.ajn.combo.customers.entities.Location;

import java.util.Optional;

public interface LocationRepository extends JpaRepository<Location, Long>, JpaSpecificationExecutor {

    Optional<Location> findById(Long locationId);

}
