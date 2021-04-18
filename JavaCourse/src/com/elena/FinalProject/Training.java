package com.elena.FinalProject;

import java.util.List;

public class Training {
    private int id;
    private int nrOfParticipants;
    private TrainingLevel level;
    private TrainingCode code;
    private List<Course> courses;


    public Training(int id, TrainingLevel level, TrainingCode code, int nrOfParticipants, List<Course> courses){
        this.id = id;
        this.nrOfParticipants = nrOfParticipants;
        this.level = level;
        this.code = code;
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNrOfParticipants() {
        return nrOfParticipants;
    }

    public void setNrOfParticipants(int nrOfParticipants) {
        this.nrOfParticipants = nrOfParticipants;
    }

    public TrainingLevel getLevel() {
        return level;
    }

    public void setLevel(TrainingLevel level) {
        this.level = level;
    }

    public TrainingCode getCode() {
        return code;
    }

    public void setCode(TrainingCode code) {
        this.code = code;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
