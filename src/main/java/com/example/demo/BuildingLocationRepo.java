package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface BuildingLocationRepo extends JpaRepository<BuildingLocation, Long> {

	public List<BuildingLocation> findByBuildingNameContaining(String building);
}
