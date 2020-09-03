package com.demo.emp.service;

import com.demo.emp.domain.UserRepository;
import com.demo.emp.domain.dto.UserDto;
import com.demo.emp.domain.dto.mapper.UserMapper;
import com.demo.emp.domain.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public List<UserDto> getAllUser() {
        return userRepository.findAll().stream().map(UserMapper::fromUser).collect(Collectors.toList());
    }
}
