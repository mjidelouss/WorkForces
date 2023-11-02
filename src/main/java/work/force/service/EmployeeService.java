package work.force.service;

import work.force.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
