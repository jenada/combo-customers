package pl.ajn.combo.customers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pl.ajn.combo.customers.entities.Dictionary;

import java.util.Optional;

public interface DictionaryRepository  extends JpaRepository<Dictionary, Long>, JpaSpecificationExecutor {

    Optional<Dictionary> findById(Long dictionaryId);

}
