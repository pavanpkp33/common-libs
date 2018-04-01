package com.sdsu.edu.cms.common.models.response;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataServiceResponse {

    private List<Object> data;
    private String message;

    public DataServiceResponse(List<Object> data, String message) {
        this.data = data;
        this.message = message;
    }

    public DataServiceResponse() {
    }

    public List<Object> getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
