package com.alamin.dto;

import com.alamin.entities.Address;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;


@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String password;

}
