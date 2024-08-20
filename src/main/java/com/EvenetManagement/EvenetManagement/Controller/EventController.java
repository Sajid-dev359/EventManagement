package com.EvenetManagement.EvenetManagement.Controller;

import com.EvenetManagement.EvenetManagement.Entities.Event;
import com.EvenetManagement.EvenetManagement.Services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;


    @GetMapping
    public List<Event>getallEvents(){
        return eventService.getallEvents();
    }

    @GetMapping("/{id}")
    public Optional <Event>getEventById(@PathVariable Long id){
        return eventService.getEventById(id);
    }

@PostMapping
public Event createEvent(@RequestBody Event event){
        return eventService.createEvent(event);
}

@PutMapping("/{id}")
public Event updateEvent(@PathVariable Long id,@RequestBody Event event){
        event.setId(id);
        return eventService.updateEvent(event);
}
@DeleteMapping("/{id}")
public void deleteEvent(@PathVariable Long id){
    eventService.deleteEvent(id);
}
@GetMapping("/venue/{venueId}")
public List<Event>getEventByVenue(@PathVariable Long venueId){
        return eventService.getEventByVenue(venueId);
}

@GetMapping("/organizer/{organizerId}")
public List<Event>getEventByorganizer(@PathVariable Long organizerId){
        return eventService.getEventByorganizer(organizerId);
}
}
