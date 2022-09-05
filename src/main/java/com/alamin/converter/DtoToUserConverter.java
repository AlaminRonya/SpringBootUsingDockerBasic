package com.alamin.converter;

import com.alamin.dto.UserDto;
import com.alamin.entities.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DtoToUserConverter {
    public User dtoToEntity(UserDto userDto){
        return new ModelMapper().map(userDto, User.class);
    }

}
