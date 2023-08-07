package com.pluralsight.conference.entities;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class AppUser extends org.springframework.security.core.userdetails.User{

    private String nickname;


    public AppUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
