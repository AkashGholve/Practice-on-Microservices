package com.practiceMicro.PUserService.services;

import com.practiceMicro.PUserService.entities.UserEntity;
import com.practiceMicro.PUserService.exceptions.ResourceNotFoundException;
import com.practiceMicro.PUserService.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepository;

    @Override
    public UserEntity saveUser(UserEntity user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUser(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("The resource not found at Server for userId: " + userId));
    }
}

