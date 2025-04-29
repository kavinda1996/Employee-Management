package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

 private Long id;
 private String name;
 private String email;
 private String department;
 private LocalDateTime createdAt;
 private LocalDateTime updatedAt;
}
