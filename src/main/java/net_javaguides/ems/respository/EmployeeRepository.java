package net_javaguides.ems.respository;

import jakarta.transaction.Transactional;
import net_javaguides.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
