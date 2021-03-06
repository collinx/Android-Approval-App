package in.ac.lnmiit.android.appointr.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Request implements Serializable {
    @SerializedName("request_id")
    private int request_id;
    @SerializedName("faculty_id")
    private int faculty_id;
    @SerializedName("student_id")
    private int student_id;
    @SerializedName("request_date")
    private long request_date;
    @SerializedName("reason")
    private String reason;
    @SerializedName("urgent")
    private int urgent;
    @SerializedName("status")
    private int status;
    @SerializedName("details")
    private String details;
    @SerializedName("modify_request")
    private int modify_request;

    @SerializedName("isClose")
    private int isClose;

    public int getRequest_id() {
        return request_id;
    }

    public void setRequest_id(int request_id) {
        this.request_id = request_id;
    }

    public int getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(int faculty_id) {
        this.faculty_id = faculty_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public long getRequest_date() {
        return request_date;
    }

    public void setRequest_date(long request_date) {
        this.request_date = request_date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int isUrgent() {
        return urgent;
    }

    public void setUrgent(int urgent) {
        this.urgent = urgent;
    }

    public int isStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int isModify_request() {
        return modify_request;
    }

    public void setModify_request(int modify_request) {
        this.modify_request = modify_request;
    }
    public int getIsClose() {
        return isClose;
    }

    public void setIsClose(int isClose) {
        this.isClose = isClose;
    }
}
