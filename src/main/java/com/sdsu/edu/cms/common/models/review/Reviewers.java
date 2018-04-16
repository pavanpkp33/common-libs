package com.sdsu.edu.cms.common.models.review;

public class Reviewers {

    private String cid;
    private String uid;
    private String role;
    private String firstName;
    private String email;
    private String valid;

    public Reviewers(String cid, String uid, String role, String firstName, String email, String valid) {
        this.cid = cid;
        this.uid = uid;
        this.role = role;
        this.firstName = firstName;
        this.email = email;
        this.valid = valid;
    }

    public Reviewers() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }
}
