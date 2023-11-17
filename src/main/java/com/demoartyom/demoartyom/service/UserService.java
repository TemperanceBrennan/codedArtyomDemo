package com.demoartyom.demoartyom.service;

import com.demoartyom.demoartyom.model.Users;

import java.util.Map;

public interface UserService {

    Long save(Users user);

    Users findById (long id);

    Map<String, String> updateUser(long id);

}
