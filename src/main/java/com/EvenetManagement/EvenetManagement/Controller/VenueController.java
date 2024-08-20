package com.EvenetManagement.EvenetManagement.Controller;

import com.EvenetManagement.EvenetManagement.Entities.Venue;
import com.EvenetManagement.EvenetManagement.Services.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/venues")
public class VenueController {

    @Autowired
    private VenueService venueService;


@GetMapping
    public List<Venue>getAllVenue(){
        return venueService.getAllVenue();
    }
    @GetMapping("/{id}")
    public Optional<Venue>getVenueById(@PathVariable Long id){
    return venueService.getVenueById(id);
    }
    @PostMapping
    public Venue createVenue(@RequestBody Venue venue){
    return  venueService.createVenue(venue);
    }
    @PutMapping("/{id}")
    public Venue updateVenue(@PathVariable Long id,@RequestBody Venue venue){
    venue.setId(id);
    return venueService.updateVenue(venue);
    }
    @DeleteMapping("/{id}")
    public void deleteVenue(@PathVariable Long id){
    venueService.deleteVenue(id);

    }
}
