package com.lambdaschool.schools.models;

/*
Title - The title of the exception
Status - Http Status Code
detail - Detailed message for the client
timestamp - date and time of the exception
developer - message for developers about this error message, things like class and code causing the error
List of Validation Errors - If data validation errors caused this error, the list of them will appear here

 */

import com.lambdaschool.schools.models.ValidationError;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ErrorDetail {
    private String title;
    private int status;
    private String detail;
    private Date timestamp;
    private String developermessage;

    List<ValidationError> errors = new ArrayList<>();

    public ErrorDetail() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getDeveloperMessage() {
        return developermessage;
    }

    public void setDeveloperMessage(String devmessage) {
        this.developermessage = devmessage;
    }

    public List<ValidationError> getErrors() {
        return errors;
    }

    public void setErrors(List<ValidationError> error) {
        this.errors = error;
    }
}
