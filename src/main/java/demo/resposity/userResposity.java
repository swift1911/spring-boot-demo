package demo.resposity;

import demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by swift on 15/9/11.
 */
public interface userResposity extends CrudRepository<User,Integer> {

}
