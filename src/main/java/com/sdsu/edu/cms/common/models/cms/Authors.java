package com.sdsu.edu.cms.common.models.cms;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Authors {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("first_name")
    private String first_name;
    @JsonProperty("middle_name")
    private String middle_name;
    @JsonProperty("last_name")
    private String last_name;
    @JsonProperty("affiliation")
    private String affiliation;
    @JsonProperty("email")
    private String email;
    @JsonProperty("is_corresponding")
    private String is_corresponding;

    public Authors() {
    }

    public Authors(String title, String first_name, String middle_name, String last_name, String affiliation, String email, String is_corresponding) {
        this.title = title;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.affiliation = affiliation;
        this.email = email;
        this.is_corresponding = is_corresponding;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIs_corresponding() {
        return is_corresponding;
    }

    public void setIs_corresponding(String is_corresponding) {
        this.is_corresponding = is_corresponding;
    }
}
