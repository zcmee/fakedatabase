package pl.fakedatabase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.fakedatabase.api.FakeRespository;
import pl.fakedatabase.domain.Shit;
import pl.fakedatabase.entities.Employee;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by SkyNET on 2017-10-29.
 */

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private FakeRespository<Employee> employeeRespository;

    @GetMapping(value = "all", produces = MediaType.APPLICATION_XML_VALUE)
    public List<Employee> getAllEmployees() {
        return employeeRespository.findAll();
    }

    @GetMapping("id/{id:[0-9]+}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeRespository.find(id);
    }

    @GetMapping("id/{id:[a-zA-Z]+}")
    public List<Employee> getEmployee(@PathVariable String id) {
        return employeeRespository.find(id);
    }

    @PostMapping("showshit/{yaku}")
    public String showshit(@RequestBody Shit shits, @PathVariable("yaku") Integer yakuzza){
        System.out.println(shits);
        return "Yondaime Hokage";
    }

//Example sended Object:
//    {
//        "name": "Bill",
//            "day": 5
//    }


    @GetMapping("/parametryzacja")
    public String getPamateres(@RequestParam String firstName, @RequestParam(name = "ostname")  String lastName, BigDecimal salary ) {
        return firstName + " aka " + lastName + " i zarabiasz: " + salary;
    }

    @RequestMapping(value = "notyfication", method = RequestMethod.GET)
    public String all() {
        return "notYfication: Działa Ty jebana polska kurwooooo";
    }

}
