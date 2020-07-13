package com.advanced.shop.online.shop.modell;

import com.advanced.shop.online.shop.modell.enums.UserType;

import java.util.HashSet;
import java.util.Set;

public class User {

    private Long id;
    private UserType userType;
    private String fullName;
    private String email;
    private Set<Address> addresses = new HashSet<>();
    private String password;

    public Long getId() {
        return id;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
