package edu.miu.cs.cs425.fairfieldlibraryapp.service;

import edu.miu.cs.cs425.fairfieldlibraryapp.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();
    User saveUser(User user);
    User getUserById(Integer userId);

}
