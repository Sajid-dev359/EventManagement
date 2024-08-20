package com.EvenetManagement.EvenetManagement.Repository;

import com.EvenetManagement.EvenetManagement.Entities.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends JpaRepository<Venue,Long> {
}
