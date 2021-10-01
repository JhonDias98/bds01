package com.devsuperior.bds01.controllers;

import com.devsuperior.bds01.dto.DepartmentDTO;
import com.devsuperior.bds01.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> findAllDepartment() {
        List<DepartmentDTO> listResult = service.findAllByOrderByNameAsc();

        return ResponseEntity.ok().body(listResult);
    }
}
