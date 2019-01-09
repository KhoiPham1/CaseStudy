package com.codegym.CaseStudy.model;

import javax.persistence.*;

@Table(name = "Khoi")
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long typeId;
    private String title;
    private String content;

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Note() {
    }

    public Note(String title) {
        this.title = title;
    }

    public void save(boolean save){}

    public void delete(boolean delete){}
}
