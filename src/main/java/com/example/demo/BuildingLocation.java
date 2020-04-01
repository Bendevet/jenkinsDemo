package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BuildingLocation {
  @Id
  @GeneratedValue
  private long id;

  private String buildingName;

  private String iconName;
  private double lat;
  private double lng;

public BuildingLocation(String buildingName, String iconName, double lat, double lng) {
	super();
	this.buildingName = buildingName;
	this.iconName = iconName;
	this.lat = lat;
	this.lng = lng;
}

public BuildingLocation() {
	super();
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getBuildingName() {
	return buildingName;
}

public void setBuildingName(String buildingName) {
	this.buildingName = buildingName;
}

public String getIconName() {
	return iconName;
}

public void setIconName(String iconName) {
	this.iconName = iconName;
}

public double getLat() {
	return lat;
}

public void setLat(double lat) {
	this.lat = lat;
}

public double getLng() {
	return lng;
}

public void setLng(double lng) {
	this.lng = lng;
}




}
