package demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import demo.entity.role_permissions;

import java.util.List;
import java.util.Optional;

/**
 * Created by swift on 15/9/9.
 */
public interface Irole{
    List<role_permissions> getById(int id);
}
