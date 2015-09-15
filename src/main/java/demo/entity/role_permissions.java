package demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by swift on 15/9/7.
 */
@Table(name = "role_permissions")
@Entity
public class role_permissions extends Event implements Serializable {

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
