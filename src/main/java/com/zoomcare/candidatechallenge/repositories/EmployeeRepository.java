/**
 * 
 */
package com.zoomcare.candidatechallenge.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zoomcare.candidatechallenge.models.Employee;

/**
 * @author lalit
 *
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	public List<Employee> findBySupervisorIsNull();

}
