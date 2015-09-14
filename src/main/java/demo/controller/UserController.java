package demo.controller;

import demo.entity.User;
import demo.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by swift on 15/9/11.
 */
@RestController
public class UserController {

    public final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/user/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(Integer.valueOf(id));
    }
}
