package com.example.parent_app;

public class AttendanceLog {

    private String time;
    private String location;
    private String scannerRole;

    // Constructors, getters, and setters
    public AttendanceLog(String time, String location, String scannerRole) {
        this.time = time;
        this.location = location;
        this.scannerRole = scannerRole;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getScannerRole() {
        return scannerRole;
    }

    public void setScannerRole(String scannerRole) {
        this.scannerRole = scannerRole;
    }
}
