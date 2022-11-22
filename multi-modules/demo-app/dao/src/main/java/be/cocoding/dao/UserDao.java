package be.cocoding.dao;

import be.cocoding.models.User;

public interface UserDao {

    User findById(Integer id);
}
