package com.piotrn.thymeleaf1.multipartupload;

import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository {
    void saveEmployee(Employee employee);
}