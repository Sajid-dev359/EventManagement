package com.EvenetManagement.EvenetManagement.Repository;

import com.EvenetManagement.EvenetManagement.Entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {

    public List<Event>findByVenueId(Long venueId);
    public List<Event>findByOrganizerId(Long organizerId);
}

