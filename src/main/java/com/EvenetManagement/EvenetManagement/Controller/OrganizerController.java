package com.EvenetManagement.EvenetManagement.Controller;

import com.EvenetManagement.EvenetManagement.Entities.Organizer;
import com.EvenetManagement.EvenetManagement.Services.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/organizers")
public class OrganizerController {
    @Autowired
    private OrganizerService organizerService;



    @GetMapping
    public List<Organizer>getAllOrganizer(){
        return organizerService.getAllOrganizer();
    }
    @GetMapping("/{id}")
    public Optional<Organizer>getOrgById(@PathVariable Long id){
        return organizerService.getOrgById(id);
    }
    @PostMapping
    public Organizer createOrganizer(@RequestBody Organizer organizer){
        return organizerService.createOrganizer(organizer);
    }
    @PutMapping("/{id}")
    public Organizer updateOrganizer(@PathVariable Long id,@RequestBody Organizer organizer){
        organizer.setId(id);
        return organizerService.updateOrganizer(organizer);
    }
    @DeleteMapping("/{id}")
    public void deleteOrganizer(@PathVariable Long id){
        organizerService.deleteOrganizer(id);
    }
}
