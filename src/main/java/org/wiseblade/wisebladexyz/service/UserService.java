package org.wiseblade.wisebladexyz.service;

import org.wiseblade.wisebladexyz.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);
    User findByEmail(String email);

    List<User> findAllUsers();
}
