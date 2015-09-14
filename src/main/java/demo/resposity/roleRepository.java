package demo.resposity;

import demo.entity.role_permissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.OrderBy;
import java.util.Set;

public interface roleRepository extends JpaRepository<role_permissions, Integer> {

    @OrderBy("roleid desc")
    @Query("select r from role_permissions r where r.roleid=:role_ID")
    //@Query(nativeQuery =true,value = "select * from role_permissions where roleid=:role_ID order by permissions_ID desc")
    Set<role_permissions> findByRoleid(@Param("role_ID") Integer role_ID);

}