package com.example.department.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long deptId;
        private String departmentName;
        private String departmentAddress;
        private String departmentCode;


}
