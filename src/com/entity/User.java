package com.entity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author : Iman
 * date : 2019/4/22
 */
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE,region = "commonCache")
@Entity
@Table(name="user")
public class User {
    private Integer id;
    private String username;
    private String password;

    @Id
    @GeneratedValue(generator ="_native" )
    @GenericGenerator(name = "_native",strategy = "native")
    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }
    @Column
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Column
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

}
