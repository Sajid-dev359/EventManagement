package com.EvenetManagement.EvenetManagement.Repository;

import com.EvenetManagement.EvenetManagement.Entities.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer,Long> {
}
