package com.EvenetManagement.EvenetManagement.Entities;

import jakarta.persistence.*;

@Entity
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String Location;
    private int capacity;

@OneToOne(mappedBy = "venue")
    private Event event;

    public Venue() {
    }

    public Venue(Long id, String name, String location, int capacity, Event event) {
        this.id = id;
        this.name = name;
        this.Location = location;
        this.capacity = capacity;
        this.event = event;
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

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Location='" + Location + '\'' +
                ", capacity=" + capacity +
                ", event=" + event +
                '}';
    }
}
