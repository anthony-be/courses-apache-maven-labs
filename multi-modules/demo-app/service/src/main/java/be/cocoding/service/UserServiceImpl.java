package be.cocoding.service;

import be.cocoding.dao.UserDao;
import be.cocoding.models.User;

public class UserServiceImpl implements UserService {

    private UserDao dao;

    @Override
    public User findById(Integer id) {
        return dao.findById(id);
    }

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }
}
