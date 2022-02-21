package com.practice.practiceproject.service;

import com.practice.practiceproject.dto.UserDto;
import com.practice.practiceproject.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public void createUser(UserDto userDto);
    List<User> showAllUser();
}


