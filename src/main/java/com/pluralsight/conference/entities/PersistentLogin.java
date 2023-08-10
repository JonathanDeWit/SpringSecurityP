package com.pluralsight.conference.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "persistent_logins")
public class PersistentLogin {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "username", referencedColumnName = "username", nullable = false)
    private User user;

    @Id
    @Column(length = 64, nullable = false)
    private String series;

    @Column(length = 64, nullable = false)
    private String token;

    @Column(name = "last_used", nullable = false)
    private Timestamp lastUsed;
}