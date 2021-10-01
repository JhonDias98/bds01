package com.devsuperior.bds01.dto;

import com.devsuperior.bds01.entities.Department;

public class DepartmentDTO {

    public Long id;
    public String name;

    public DepartmentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDTO(Department entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public DepartmentDTO() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
