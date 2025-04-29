package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Employee;
import edu.icet.ecom.entity.EmployeeEntity;
import edu.icet.ecom.repository.EmployeeRepository;
import edu.icet.ecom.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    final EmployeeRepository repository;
    final ModelMapper mapper;

    @Override
    public void addEmployee(Employee employee) {
repository.save(mapper.map(employee, EmployeeEntity.class));
    }
}
