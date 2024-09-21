
package id.gilangprambudi.web.foundation.service.core.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: User.java, v 0.1 2024‐09‐15 22.39 gilang.prambudi Exp $$
 */

@Entity
@Table(name = "web_user")
public class WebUser implements Serializable {

    @Id
    private String id;

    private String username;

    /**
     * Getter method for property id.
     *
     * @return property value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for property id.
     *
     * @param id value to be assigned to property id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter method for property username.
     *
     * @return property value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter method for property username.
     *
     * @param username value to be assigned to property username
     */
    public void setUsername(String username) {
        this.username = username;
    }
}
