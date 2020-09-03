package com.demo.emp.service;

import com.demo.emp.domain.dto.UserDto;
import com.demo.emp.domain.model.User;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUser();
}

