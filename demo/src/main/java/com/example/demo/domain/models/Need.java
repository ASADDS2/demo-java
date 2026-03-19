package com.example.demo.domain.models;

public class Need {
    private Long id;
    private String title;
    private String description;
    private NeedCategory category;
    private NeedStatus status;
    private Long requesterId;

    public Need() {
    }

    public Need(Long id, String title, String description, NeedCategory category, NeedStatus status, Long userID) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.status = status;
        this.requesterId = requesterId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public NeedCategory getCategory() {
        return category;
    }

    public void setCategory(NeedCategory category) {
        this.category = category;
    }

    public NeedStatus getStatus() {
        return status;
    }

    public void setStatus(NeedStatus status) {
        this.status = status;
    }

    public Long getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(Long requesterId) {
        this.requesterId = requesterId;
    }
}