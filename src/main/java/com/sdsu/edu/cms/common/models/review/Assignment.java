package com.sdsu.edu.cms.common.models.review;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Assignment {

    @JsonProperty("assignmentId")
    private String assignmentId;
    @JsonProperty("reviewerId")
    private String reviewerId;
    @JsonProperty("reviewerName")
    private String reviewerName;
    @JsonProperty("reviewerEmail")
    private String reviewerEmail;
    @JsonProperty("conferenceId")
    private String conferenceId;
    @JsonProperty("submissionId")
    private String submissionId;


    public Assignment(String assignmentId, String reviewerId, String reviewerName, String reviewerEmail, String conferenceId, String submissionId) {
        this.assignmentId = assignmentId;
        this.reviewerId = reviewerId;
        this.reviewerName = reviewerName;
        this.reviewerEmail = reviewerEmail;
        this.conferenceId = conferenceId;
        this.submissionId = submissionId;
    }

    public Assignment() {
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getReviewerEmail() {
        return reviewerEmail;
    }

    public void setReviewerEmail(String reviewerEmail) {
        this.reviewerEmail = reviewerEmail;
    }

    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }
}

