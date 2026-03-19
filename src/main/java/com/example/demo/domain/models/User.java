package com.example.demo.domain.models;

import java.util.List;
public class User {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private List<String> needIDs;
    private String skills;

    public User(){
    }

    public User(long id, String name, String email, String phoneNumber, List<String> needIDs, String skills) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.needIDs = needIDs;
        this.skills = skills;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getNeedIDs() {
        return needIDs;
    }

    public void setNeedIDs(List<String> needIDs) {
        this.needIDs = needIDs;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}