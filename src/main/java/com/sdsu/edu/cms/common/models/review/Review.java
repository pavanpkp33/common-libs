package com.sdsu.edu.cms.common.models.review;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Review {

    @JsonProperty("reviewId")
    private String reviewId;
    @JsonProperty("submissionId")
    private String submissionId;
    @JsonProperty("conferenceId")
    private String conferenceId;
    @JsonProperty("reviewerId")
    private String reviewerId;
    @JsonProperty("reviewerName")
    private String reviewerName;
    @JsonProperty("reviewerEmail")
    private String reviewerEmail;
    @JsonProperty("review")
    private String review;
    @JsonProperty("score")
    private int score;
    @JsonProperty("messageChair")
    private String messageChair;
    @JsonProperty("confidenceScore")
    private int confidenceScore;
    @JsonProperty("lastUpdated")
    private Date lastUpdated;
    @JsonProperty("publish")
    private String publish;
    @JsonProperty("valid")
    private String valid;

    public Review() {

    }

    public Review(String reviewId, String submissionId, String conferenceId, String reviewerId, String reviewerName, String reviewerEmail, String review, int score, String messageChair, int confidenceScore, Date lastUpdated, String publish, String valid) {
        this.reviewId = reviewId;
        this.submissionId = submissionId;
        this.conferenceId = conferenceId;
        this.reviewerId = reviewerId;
        this.reviewerName = reviewerName;
        this.reviewerEmail = reviewerEmail;
        this.review = review;
        this.score = score;
        this.messageChair = messageChair;
        this.confidenceScore = confidenceScore;
        this.lastUpdated = lastUpdated;
        this.publish = publish;
        this.valid = valid;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
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

    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMessageChair() {
        return messageChair;
    }

    public void setMessageChair(String messageChair) {
        this.messageChair = messageChair;
    }

    public int getConfidenceScore() {
        return confidenceScore;
    }

    public void setConfidenceScore(int confidenceScore) {
        this.confidenceScore = confidenceScore;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
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

    @JsonIgnore
    public Object[] getParams(){
        return new Object[]{
          this.reviewId,
          this.submissionId,
          this.reviewerId,
          this.review,
          this.score,
          this.messageChair,
          this.confidenceScore,
          this.conferenceId
        };
    }
}
