package com.EvenetManagement.EvenetManagement.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    private int contactInfo;

    @OneToMany(mappedBy = "organizer")
    private List<Event>events;

    public Organizer() {
    }

    public Organizer(Long id, String name, int contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(int contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Organizer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactInfo=" + contactInfo +
                '}';
    }
}
