package com.calculator.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tblUser")
public class Role {
    private Long id;
    private String username;
    private String password;
    private String passwordConfirm;
    private Set<Role> roles;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId(){
        return id;
    }
}
