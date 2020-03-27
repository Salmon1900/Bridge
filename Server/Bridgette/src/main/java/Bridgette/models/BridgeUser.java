package Bridgette.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="t_users")
public class BridgeUser {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="user_id")
    @JsonProperty
    private Integer id;

    @Column(name="username")
    @JsonProperty
    private String name;

    @Column(name="password")
    @JsonProperty
    private String password;

    @Column(name="is_admin")
    @JsonProperty
    private boolean isAdmin;

    public Integer id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String password() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
