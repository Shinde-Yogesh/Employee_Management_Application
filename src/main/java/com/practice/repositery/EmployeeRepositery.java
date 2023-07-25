package com.practice.repositery;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.practice.entities.Employee;

public interface EmployeeRepositery extends CrudRepository<Employee, ID> {
	

}
