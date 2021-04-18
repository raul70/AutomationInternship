package com.elena.FinalProject;

public class Course {
    private int id;
    private String title;
    private String description;
    private int hoursDuration;
    double coursePrice;
    public Course(int id, String title, String description, int hoursDuration){
        this.id = id;
        this.title = title;
        this.description = description;
        this.hoursDuration = hoursDuration;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", hoursDuration=" + hoursDuration +
                ", coursePrice=" + coursePrice +
                '}';
    }
}
