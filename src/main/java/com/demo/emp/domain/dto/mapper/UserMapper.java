package com.demo.emp.domain.dto.mapper;

import com.demo.emp.domain.dto.UserDto;
import com.demo.emp.domain.model.User;

public class UserMapper {
    public static UserDto fromUser (User user) {
        UserDto dto = new UserDto();
        dto.setName(user.getName());
        dto.setAddress(user.getAddress());
        dto.setEmail(user.getEmail());
        dto.setDepartmentName(user.getDepartment().getName());
        dto.setJobTitle(user.getJob().getTitle());
        dto.setPhoneNumber(user.getPhoneNumber());
        return dto;
    }
}
