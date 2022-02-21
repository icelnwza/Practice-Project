package com.practice.practiceproject.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.practice.practiceproject.dto.UserDto;
import com.practice.practiceproject.entity.User;
import com.practice.practiceproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(UserDto userDto) {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.convertValue(userDto, User.class);
        userRepository.save(user);

    }

    @Override
    public List<User> showAllUser() {
        return userRepository.findAll();
    }
}
