package com.javidan.ms_springboot_course.Service;

import com.javidan.ms_springboot_course.Model.EmployeeResponse;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public EmployeeResponse getEmployeeById(int employeeId) {
        System.out.println("id: " + employeeId);
        return new EmployeeResponse("Javidan", "Hajiyev");
    }

    public void updateEmployeeFirstName (int employeeId,
                                         String firstName){
        System.out.println("firstName: " + firstName + " id: " + employeeId);
    }
}
