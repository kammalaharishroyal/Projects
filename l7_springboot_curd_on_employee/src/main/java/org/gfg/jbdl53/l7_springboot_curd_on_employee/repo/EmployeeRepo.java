package org.gfg.jbdl53.l7_springboot_curd_on_employee.repo;

import org.gfg.jbdl53.l7_springboot_curd_on_employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
