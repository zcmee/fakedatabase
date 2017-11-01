package pl.fakedatabase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import pl.fakedatabase.api.FakeRespository;
import pl.fakedatabase.domain.Shit;
import pl.fakedatabase.entities.Employee;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

    @GetMapping("/allheaders")
    public String getHeaderInfo(
            @RequestHeader Map<String, String> headerMap,
            @RequestParam Map<String, String> parameterMap
    ) {
        Set<String> keysH =  headerMap.keySet();
        keysH.stream().map(headerMap::get).forEach(System.out::println);
        System.out.println("-------------------------------------------");
        Set<String> keysP =  parameterMap.keySet();
        keysP.stream().map(parameterMap::get).forEach(System.out::println);
        return "WPIERDALASZ GOWNO";
    }

    @GetMapping("password")
    public HttpEntity<String> getSecret(@RequestParam Integer password) {
        if(password.equals(666)) {
            return ResponseEntity.ok("Dobre hasło kurwo babilońska");
        } else {
            return ResponseEntity.status(HttpStatus.GONE).body("Ty kurwa macedońska WYPIERDALAJ!!!");
        }
    }

    @RequestMapping(value = "notyfication", method = RequestMethod.GET)
    public String all() {
        return "notYfication: Działa Ty jebana polska kurwooooo";
    }

}
