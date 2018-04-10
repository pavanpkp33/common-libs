package com.sdsu.edu.cms.common.models.cms;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class  Conference {
    @JsonProperty("conference_id")
    private String cid;
    @JsonProperty("conference_name")
    private String cname;
    @JsonProperty("conference_accronym")
    private String caccronym;
    @JsonProperty("conference_year")
    private int cyear;
    @JsonProperty("chair_id")
    private String chair_uid;
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

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCaccronym() {
        return caccronym;
    }

    public void setCaccronym(String caccronym) {
        this.caccronym = caccronym;
    }

    public int getCyear() {
        return cyear;
    }

    public void setCyear(int cyear) {
        this.cyear = cyear;
    }

    public String getChair_uid() {
        return chair_uid;
    }

    public void setChair_uid(String chair_uid) {
        this.chair_uid = chair_uid;
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

    public Conference(String cid, String cname, String caccronym, int cyear, String chair_uid, Date start_date, Date end_date, String web_link, String valid, String contact, String about, String banner_url, String venue, String city, String country, String submissions_enabled) {
        this.cid = cid;
        this.cname = cname;
        this.caccronym = caccronym;
        this.cyear = cyear;
        this.chair_uid = chair_uid;
        this.start_date = start_date;
        this.end_date = end_date;
        this.web_link = web_link;
        this.valid = valid;
        this.contact = contact;
        this.about = about;
        this.banner_url = banner_url;
        this.venue = venue;
        this.city = city;
        this.country = country;
        this.submissions_enabled = submissions_enabled;
    }

    @JsonIgnore
    public Object[] getData(){
        return new Object[]{
                this.cid,
                this.cname,
                this.caccronym,
                this.cyear,
                this.chair_uid,
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
