package com.sdsu.edu.cms.common.models.cms;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Conference {
    @JsonProperty("conference_id")
    private String conference_id;
    @JsonProperty("conference_name")
    private String conference_name;
    @JsonProperty("conference_accronym")
    private String conference_accronym;
    @JsonProperty("conference_year")
    private int conference_year;
    @JsonProperty("chair_id")
    private String chair_id;
    @JsonProperty("start_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date start_date;
    @JsonProperty("end_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date end_date;
    @JsonProperty("web_link")
    private String web_link;
    @JsonProperty("valid")
    private String valid;
    @JsonProperty("contact")
    private String contact;
    @JsonProperty("about")
    private String about;
    @JsonProperty("banner_url")
    private String banner_url;
    @JsonProperty("venue")
    private String venue;
    @JsonProperty("city")
    private String city;
    @JsonProperty("country")
    private String country;
    @JsonProperty("submissions_enabled")
    private String submissions_enabled;

    public String getSubmissions_enabled() {
        return submissions_enabled;
    }

    public void setSubmissions_enabled(String submissions_enabled) {
        this.submissions_enabled = submissions_enabled;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Conference() {
    }

    public String getConference_id() {
        return conference_id;
    }

    public void setConference_id(String conference_id) {
        this.conference_id = conference_id;
    }

    public String getConference_name() {
        return conference_name;
    }

    public void setConference_name(String conference_name) {
        this.conference_name = conference_name;
    }

    public String getConference_accronym() {
        return conference_accronym;
    }

    public void setConference_accronym(String conference_accronym) {
        this.conference_accronym = conference_accronym;
    }

    public int getConference_year() {
        return conference_year;
    }

    public void setConference_year(int conference_year) {
        this.conference_year = conference_year;
    }

    public String getChair_id() {
        return chair_id;
    }

    public void setChair_id(String chair_id) {
        this.chair_id = chair_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getWeb_link() {
        return web_link;
    }

    public void setWeb_link(String web_link) {
        this.web_link = web_link;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getBanner_url() {
        return banner_url;
    }

    public void setBanner_url(String banner_url) {
        this.banner_url = banner_url;
    }

    @JsonIgnore
    public Object[] getData(){
        return new Object[]{
                this.conference_id,
                this.conference_name,
                this.conference_accronym,
                this.conference_year,
                this.chair_id,
                this.start_date,
                this.end_date,
                this.web_link,
                this.contact,
                this.about,
                this.banner_url,
                this.venue,
                this.city,
                this.country
        };
    }
}
