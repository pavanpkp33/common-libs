package com.sdsu.edu.cms.common.models.user;

public class AuthUser {

    private String id;
    private String email;
    private String password;
    private String isValid;
    private String isActive;

    public AuthUser() {
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AuthUser(String id, String email, String password, String isValid, String isActive) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.isValid = isValid;
        this.isActive = isActive;
    }
}
