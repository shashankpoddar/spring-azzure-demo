package net_javaguides.ems.service;

import net_javaguides.ems.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto getEmployeeById(Long employeeId);
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    // Add other methods if needed
}
