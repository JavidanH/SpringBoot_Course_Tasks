package com.javidan.ms_springboot_course.Controller;

import com.javidan.ms_springboot_course.Model.EmployeeResponse;
import com.javidan.ms_springboot_course.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("v1/employees")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{employeeId}")
    public EmployeeResponse getEmployeeById(
            @RequestHeader(name = "api-key",defaultValue = "test") String apiKey,
            @PathVariable int employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PatchMapping("/{employeeId}")
    public void updateEmployeeFirstName (@PathVariable int employeeId,
                                         @RequestParam String firstName){
        employeeService.updateEmployeeFirstName(employeeId,firstName);
    }

}
