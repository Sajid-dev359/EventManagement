package com.EvenetManagement.EvenetManagement.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Event {

    @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String eventName;
    private LocalDate eventDate;
    private String Description;

    @ManyToOne
    @JoinColumn(name = "organizer_id")
    private Organizer organizer;

    @ManyToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;

    public Event() {
    }

    public Event(Long id, String eventName, LocalDate eventDate, String description, Organizer organizer, Venue venue) {
        this.id = id;
        this.eventName = eventName;
        this.eventDate = eventDate;
       this.Description = description;
        this.organizer = organizer;
        this.venue = venue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                ", Description='" + Description + '\'' +
                ", organizer=" + organizer +
                ", venue=" + venue +
                '}';
    }
}

