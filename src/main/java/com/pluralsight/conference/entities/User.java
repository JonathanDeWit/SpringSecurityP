package com.pluralsight.conference.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")  // The table name is "users" by default in Spring Security
public class User {

    @Id
    @Column(length = 50)
    private String username;

    @Column(length = 100, nullable = false)
    private String password;

    private boolean enabled;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.EAGER)
    private Set<Authority> authorities;

    // standard getters and setters, possibly constructors, equals, and hashCode
}