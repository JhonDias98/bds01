package com.devsuperior.bds01.service;

import com.devsuperior.bds01.dto.DepartmentDTO;
import com.devsuperior.bds01.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public List<DepartmentDTO> findAllByOrderByNameAsc() {
        return repository.findAllByOrderByNameAsc()
                .stream()
                .map(DepartmentDTO::new)
                .collect(Collectors.toList());
    }
}
