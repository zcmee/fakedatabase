package pl.fakedatabase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.fakedatabase.api.FakeRespository;
import pl.fakedatabase.entities.Employee;

import java.util.List;

/**
 * Created by SkyNET on 2017-10-29.
 */

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private FakeRespository<Employee> employeeRespository;

    @GetMapping("all")
    public List<Employee> getAllEmployees() {
        return employeeRespository.findAll();
    }

    @GetMapping("/{id:[0-9]+}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeRespository.find(id);
    }

    @GetMapping("/{id:[a-zA-Z]+}")
    public List<Employee> getEmployee(@PathVariable String id) {
        return employeeRespository.find(id);
    }

    @RequestMapping(value = "notyfication", method = RequestMethod.GET)
    public String all() {
        return "notYfication: Działa Ty jebana polska kurwooooo";
    }

}
