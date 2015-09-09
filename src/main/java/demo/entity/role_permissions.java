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
public class role_permissions implements Serializable {

    @Id
    @Column
    private int role_ID;

    public int getRole_ID() {
        return role_ID;
    }

    public void setRole_ID(int role_ID) {
        this.role_ID = role_ID;
    }

    public int getPermissions_ID() {
        return permissions_ID;
    }

    public void setPermissions_ID(int permissions_ID) {
        this.permissions_ID = permissions_ID;
    }

    @Id
    @Column
    private int permissions_ID;
}
