package com.practiceMicro.PUserService.services;


import com.practiceMicro.PUserService.entities.UserEntity;

import java.util.List;

//@Service  //annotation @Service lies where implementation of service layer
public interface UserService {

    UserEntity saveUser(UserEntity user);

    List<UserEntity> getAllUsers();

    UserEntity getUser(String userId);

}
