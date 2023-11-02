package work.force;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work.force.repository.EmployeeRepository;
import work.force.service.EmployeeService;
import work.force.service.Imp.EmployeeServiceImp;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeServiceImp.class);
        System.out.println("Hello world!");
        System.out.println(employeeService.findAll());
    }
}