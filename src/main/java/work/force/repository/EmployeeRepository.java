package work.force.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.force.entities.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {

}
