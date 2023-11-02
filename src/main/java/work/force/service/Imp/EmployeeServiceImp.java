package work.force.service.Imp;

import work.force.repository.EmployeeRepository;
import work.force.entities.Employee;

import java.util.List;

public class EmployeeServiceImp implements work.force.service.EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
}
