package be.cocoding.service;

import be.cocoding.models.User;

public interface UserService {

    User findById(Integer id);
}
