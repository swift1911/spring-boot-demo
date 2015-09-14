package demo.controller;

import demo.entity.role_permissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import demo.service.impl.role;

import java.util.List;
import java.util.Set;

/**
 * Created by swift on 15/9/9.
 */
@RestController
public class permissionController {


    private final role roleService;

    @Autowired
    public permissionController(role role) {
        this.roleService = role;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "hello world";
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return "hi";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Set<role_permissions> getByPermissionId(@PathVariable String id) {
        //return null;
        return roleService.getById(Integer.valueOf(id));
    }
}
