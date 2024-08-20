package com.EvenetManagement.EvenetManagement.Services;

import com.EvenetManagement.EvenetManagement.Entities.Organizer;
import com.EvenetManagement.EvenetManagement.Repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizerService {


    @Autowired
    private OrganizerRepository organizerRepository;


    public List<Organizer>getAllOrganizer(){
        return organizerRepository.findAll();

    }

    public Optional<Organizer> getOrgById(Long id){
        return organizerRepository.findById(id);
    }


    public Organizer createOrganizer(Organizer organizer){
        return organizerRepository.save(organizer);
    }

    public Organizer updateOrganizer(Organizer organizer){
        return organizerRepository.save(organizer);

    }

    public void deleteOrganizer(Long id){
        organizerRepository.deleteById(id);
    }
}
