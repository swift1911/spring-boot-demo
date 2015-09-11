package demo.resposity;

import demo.entity.role_permissions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface roleRepository extends JpaRepository<role_permissions, Integer> {
    List<role_permissions> findByroleid(int role_ID);

}