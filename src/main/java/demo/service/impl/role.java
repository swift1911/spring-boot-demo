package demo.service.impl;

import demo.entity.role_permissions;
import demo.service.Irole;
import demo.resposity.roleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by swift on 15/9/9.
 */
@Service
public class role implements Irole {

    private final roleRepository rolerepository;

    @Autowired
    public role(roleRepository rolerepository) {
        this.rolerepository = rolerepository;
    }

    @Override
    public Set<role_permissions> getById(int role_ID) {
        return rolerepository.findByRoleid(role_ID);
    }
}
