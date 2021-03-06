package net.javaguides.springbootthymeleafcrudwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springbootthymeleafcrudwebapp.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
