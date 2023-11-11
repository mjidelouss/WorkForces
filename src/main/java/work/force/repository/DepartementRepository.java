package work.force.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.force.entities.Departement;

public interface DepartementRepository extends JpaRepository <Departement, Long> {

}
