package demo.service.impl;

import demo.core.activemqInit;
import demo.entity.User;
import demo.service.IUser;
import demo.resposity.userResposity;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by swift on 15/9/11.
 */
@Service
public class UserService implements IUser {
    private final userResposity userresposity;

    @Autowired
    public UserService(userResposity userresposity) {
        this.userresposity = userresposity;
    }

    public User getUserById(int Id) {
        return userresposity.findOne(Id);
    }

}
