package com.rksinha.learning.entity;

import jakarta.persistence.*;

@Table(name = "todos")
@Entity()
public class Todo {

    @Id
    @GeneratedValue( strategy =  GenerationType.AUTO)
    @Column(nullable = false)
    private  long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private int priority;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private boolean isComplete;


    public  Todo(){}

    public Todo(String title, int priority, String description, boolean isComplete) {
        this.title = title;
        this.priority = priority;
        this.description = description;
        this.isComplete = isComplete;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
