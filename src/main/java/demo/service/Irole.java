package demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import demo.entity.role_permissions;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by swift on 15/9/9.
 */
public interface Irole{
    Set<role_permissions> getById(int id);
}
