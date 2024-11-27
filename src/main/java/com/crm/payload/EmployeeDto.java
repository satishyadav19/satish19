package com.crm.payload;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;

@Getter
@Setter
public class EmployeeDto {

    private Long id;

    @NotBlank
   @Size(min=3, message = "Atleast 3 characters required")
    private String name;

    @Email
    private String emailId;

    @Size(min = 10,max = 10, message ="not greater than 10 digits are allowed")
    private String mobile;

}
