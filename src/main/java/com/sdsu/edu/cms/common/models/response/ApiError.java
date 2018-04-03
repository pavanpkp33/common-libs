package com.sdsu.edu.cms.common.models.response;

public class ApiError {

    public String error;
    public String error_description;
    public String uri;

    public ApiError(String error, String error_description, String uri) {
        this.error = error;
        this.error_description = error_description;
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ApiError() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }
}
