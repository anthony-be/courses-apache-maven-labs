package be.cocoding.web;

import be.cocoding.models.User;
import be.cocoding.service.UserService;

public class UserController {

    private UserService service;

    public User findById(Integer id){
        return service.findById(id);
    }

    public UserService getService() {
        return service;
    }

    public void setService(UserService service) {
        this.service = service;
    }
}
