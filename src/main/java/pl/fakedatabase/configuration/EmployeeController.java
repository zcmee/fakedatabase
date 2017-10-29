package pl.fakedatabase.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.fakedatabase.api.FakeRespository;
import pl.fakedatabase.entities.Employee;

import java.util.List;

/**
 * Created by SkyNET on 2017-10-29.
 */

@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    FakeRespository employeeRespository;


    @GetMapping("all")
    public List<Employee> getAllEmployees() {
        return employeeRespository.findAll();
    }

    @RequestMapping(value = "notyfication", method = RequestMethod.GET)
    public String all() {
        return "notYfication: Działa Ty jebana polska kurwooooo";
    }

}
