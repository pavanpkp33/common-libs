package com.sdsu.edu.cms.common.models.cms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

public class Submission {

    @JsonProperty("submission_id")
    private String submission_id;
    @JsonProperty("conference_id")
    private String cid;
    @JsonProperty("title")
    private String title;
    @JsonProperty("submission_date")
    private Date submission_date;
    @JsonProperty("submit_author_id")
    private String submit_author_id;
    @JsonProperty("track_id")
    private int track_id;
    @JsonProperty("abstract_text")
    private String abstract_text;
    @JsonProperty("last_updated")
    private Date last_updated;
    @JsonProperty("decision_status")
    private String decision_status;
    @JsonProperty("is_paid")
    private String is_paid;
    @JsonProperty("valid")
    private String valid;
    @JsonProperty("group_app")
    private int group_app;
    @JsonProperty("keywords")
    private String[] keyword;
    @JsonProperty("draft_paper")
    @JsonIgnore
    private MultipartFile draft_paper;
    @JsonProperty("final_paper")
    @JsonIgnore
    private MultipartFile final_paper;
    @JsonProperty("camera_ready_paper")
    @JsonIgnore
    private MultipartFile camera_ready_paper;
    @JsonProperty("draft_paper_url")
    private String draftPaperUri;
    @JsonProperty("final_paper_url")
    private String finalPaperUri;
    @JsonProperty("camera_ready_paper_url")
    private String cameraReadyPaperUri;
    @JsonProperty("authors")
    private List<Authors> authorsList;

    public Submission() {
    }

    public Submission(String submission_id, String cid, String title, Date submission_date, String submit_author_id, int track_id, String abstract_text, Date last_updated, String decision_status, String is_paid, String valid, int group_app, String[] keyword, String draftPaperUri, String finalPaperUri, String cameraReadyPaperUri) {
        this.submission_id = submission_id;
        this.cid = cid;
        this.title = title;
        this.submission_date = submission_date;
        this.submit_author_id = submit_author_id;
        this.track_id = track_id;
        this.abstract_text = abstract_text;
        this.last_updated = last_updated;
        this.decision_status = decision_status;
        this.is_paid = is_paid;
        this.valid = valid;
        this.group_app = group_app;
        this.keyword = keyword;
        this.draftPaperUri = draftPaperUri;
        this.finalPaperUri = finalPaperUri;
        this.cameraReadyPaperUri = cameraReadyPaperUri;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public List<Authors> getAuthorsList() {
        return authorsList;
    }

    public void setAuthorsList(List<Authors> authorsList) {
        this.authorsList = authorsList;
    }

    public String getSubmission_id() {
        return submission_id;
    }

    public void setSubmission_id(String submission_id) {
        this.submission_id = submission_id;
    }

    public MultipartFile getDraft_paper() {
        return draft_paper;
    }

    public void setDraft_paper(MultipartFile draft_paper) {
        this.draft_paper = draft_paper;
    }

    public MultipartFile getFinal_paper() {
        return final_paper;
    }

    public void setFinal_paper(MultipartFile final_paper) {
        this.final_paper = final_paper;
    }

    public MultipartFile getCamera_ready_paper() {
        return camera_ready_paper;
    }

    public void setCamera_ready_paper(MultipartFile camera_ready_paper) {
        this.camera_ready_paper = camera_ready_paper;
    }

    public String getDraftPaperUri() {
        return draftPaperUri;
    }

    public void setDraftPaperUri(String draftPaperUri) {
        this.draftPaperUri = draftPaperUri;
    }

    public String getFinalPaperUri() {
        return finalPaperUri;
    }

    public void setFinalPaperUri(String finalPaperUri) {
        this.finalPaperUri = finalPaperUri;
    }

    public String getCameraReadyPaperUri() {
        return cameraReadyPaperUri;
    }

    public void setCameraReadyPaperUri(String cameraReadyPaperUri) {
        this.cameraReadyPaperUri = cameraReadyPaperUri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getSubmission_date() {
        return submission_date;
    }

    public void setSubmission_date(Date submission_date) {
        this.submission_date = submission_date;
    }

    public String getSubmit_author_id() {
        return submit_author_id;
    }

    public void setSubmit_author_id(String submit_author_id) {
        this.submit_author_id = submit_author_id;
    }

    public int getTrack_id() {
        return track_id;
    }

    public void setTrack_id(int track_id) {
        this.track_id = track_id;
    }

    public String getAbstract_text() {
        return abstract_text;
    }

    public void setAbstract_text(String abstract_text) {
        this.abstract_text = abstract_text;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }

    public String getDecision_status() {
        return decision_status;
    }

    public void setDecision_status(String decision_status) {
        this.decision_status = decision_status;
    }

    public String getIs_paid() {
        return is_paid;
    }

    public void setIs_paid(String is_paid) {
        this.is_paid = is_paid;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public int getGroup_app() {
        return group_app;
    }

    public void setGroup_app(int group_app) {
        this.group_app = group_app;
    }

    public String[] getKeyword() {
        return keyword;
    }

    public void setKeyword(String[] keyword) {
        this.keyword = keyword;
    }


}
