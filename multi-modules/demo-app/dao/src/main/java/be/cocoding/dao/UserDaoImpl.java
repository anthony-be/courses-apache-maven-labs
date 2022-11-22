package be.cocoding.dao;

import be.cocoding.models.User;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl implements UserDao {

    private Map<Integer, User> userMap = new HashMap<>();

    public User findById(Integer id){
        return userMap.get(id);
    }

}
