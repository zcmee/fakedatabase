package pl.fakedatabase.resources;

import org.springframework.stereotype.Service;
import pl.fakedatabase.api.Generator;
import pl.fakedatabase.entities.Employee;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
//@Resource //@TODO dlaczego intelilij daje mi bez public
public class EmployeesGenerator implements Generator<Employee> {

    @Override
    public List<Employee> generate() {
        ArrayList<Employee> employess = new ArrayList<>(10);
            employess.add(new Employee(1, "Wojtyła", 124.23));
            employess.add(new Employee(2, "Yoyne", 897.11));
            employess.add(new Employee(3, "ZimmermannY", 24.23));
            employess.add(new Employee(4, "Krzysztof", 12.99));
            employess.add(new Employee(5, "Adam", 11.34));
            employess.add(new Employee(6, "ZimmermannP", 123d));

        return employess;
    }

}
