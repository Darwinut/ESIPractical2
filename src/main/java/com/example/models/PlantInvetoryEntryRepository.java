package com.example.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface PlantInvetoryEntryRepository extends JpaRepository<PlantInventoryEntry,Long> {
	List<PlantInventoryEntry> findByNameContaining(String str); 
	  @Query("select p from PlantInventoryEntry p where LOWER(p.name) like ?1 ") 
	  List<PlantInventoryEntry> finderMethod(String name);
}
