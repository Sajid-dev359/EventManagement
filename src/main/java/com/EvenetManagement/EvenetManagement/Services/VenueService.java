package com.EvenetManagement.EvenetManagement.Services;

import com.EvenetManagement.EvenetManagement.Entities.Venue;
import com.EvenetManagement.EvenetManagement.Repository.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VenueService {

    @Autowired
   private VenueRepository venueRepository;

    public List<Venue>getAllVenue(){
        return venueRepository.findAll();
    }

    public Optional<Venue> getVenueById(Long id){
        return venueRepository.findById(id);
    }
    public Venue createVenue(Venue venue){
        return venueRepository.save(venue);

    }
        public  Venue updateVenue(Venue venue) {
            return venueRepository.save(venue);
        }
        public void deleteVenue(Long id){
        venueRepository.deleteById(id);
        }





}
