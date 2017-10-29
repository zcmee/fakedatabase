package pl.fakedatabase.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.fakedatabase.api.FakeRespository;
import pl.fakedatabase.entities.Employee;
import pl.fakedatabase.resources.EmployeesGenerator;
import java.util.List;

/**
 * Created by SkyNET on 2017-10-29.
 */

@Repository
public class EmployeeRepository implements FakeRespository {
    private final List<Employee> employees;

    @Autowired
    public EmployeeRepository(EmployeesGenerator employees) {
        this.employees = employees.generate();
    }

    @Override
    public Employee find(Integer id) {
        return employees.stream()
                        .filter(v -> v.getId() == id)
                        .findFirst().get();
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }
}
