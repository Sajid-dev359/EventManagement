package com.EvenetManagement.EvenetManagement.Services;

import com.EvenetManagement.EvenetManagement.Entities.Event;
import com.EvenetManagement.EvenetManagement.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event>getallEvents(){
        return eventRepository.findAll();

    }


    public Optional<Event> getEventById(Long id){
        return eventRepository.findById(id);
    }

    public Event createEvent(Event event){
        return eventRepository.save(event);
    }


    public Event updateEvent(Event event){
        return eventRepository.save(event);


    }

    public void deleteEvent(Long id){
        eventRepository.deleteById(id);
    }

    public List<Event>getEventByVenue(Long venueId){
        return eventRepository.findByVenueId(venueId);
    }

    public List<Event>getEventByorganizer(Long organizerid){
        return eventRepository.findByOrganizerId(organizerid);
    }
}
