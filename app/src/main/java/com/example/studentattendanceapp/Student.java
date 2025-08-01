package com.example.studentattendanceapp;


public class Student {
    private int id;
    private String name;
    private boolean isPresent;
    private boolean hasDutyLeave;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.isPresent = false;
        this.hasDutyLeave = false;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public boolean isPresent() { return isPresent; }
    public void setPresent(boolean present) { isPresent = present; }
    public boolean hasDutyLeave() { return hasDutyLeave; }
    public void setDutyLeave(boolean dutyLeave) { hasDutyLeave = dutyLeave; }
}
