package demo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by swift on 15/9/7.
 */
@Table(name = "role_permissions")
@Entity
public class role_permissions implements Serializable {

    @Id
    @Column(nullable = false)
    private int roleid;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public int getPermissions_ID() {
        return permissions_ID;
    }

    public void setPermissions_ID(int permissions_ID) {
        this.permissions_ID = permissions_ID;
    }

    @Column(nullable = false)
    private int permissions_ID;
}
