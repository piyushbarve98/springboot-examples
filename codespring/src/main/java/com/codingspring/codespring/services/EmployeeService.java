package com.codingspring.codespring.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.codingspring.codespring.dto.EmployeeDTO;
import com.codingspring.codespring.entities.EmployeeEntity;
import com.codingspring.codespring.repositories.EmployeeRepository;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;
    
    final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper){
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmployeeById(Long id){
        EmployeeEntity employeeEntity = employeeRepository.getById(id);
        // return new EmployeeDTO(employeeEntity.getId(), employeeEntity.getName(), employeeEntity.getDateOfJoining(), employeeEntity.isActive());
        return modelMapper.map(employeeEntity, EmployeeDTO.class);

    }

    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO){
        EmployeeEntity employeeEntity = modelMapper.map(employeeDTO, EmployeeEntity.class);
        return modelMapper.map(employeeRepository.save(employeeEntity), EmployeeDTO.class);
    }

}
