package edu.icet.ecom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.processing.Pattern;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_entity")
    public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
//    @NotBlank(message = "Name is required")
//    @Size(max = 100, message = "Name must be less than 100 characters")
//    @Pattern(regexp = "^[A-Za-z ]+$", message = "Name can only contain letters and spaces")

    private String name;
//    @NotBlank(message = "Email is required")
//    @Email(message = "Invalid email format")
    @Column(unique = true)
    private String email;
        private String department;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
    }


