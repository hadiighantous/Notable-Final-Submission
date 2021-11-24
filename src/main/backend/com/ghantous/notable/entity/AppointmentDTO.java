package com.ghantous.notable.entity;

public class AppointmentDTO {

    private String name, kind;
    private String time;

    public AppointmentDTO(String name, String time, String kind) {
        this.name = name;
        this.time = time;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
