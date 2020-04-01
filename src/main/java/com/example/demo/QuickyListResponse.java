package com.example.demo;

import java.util.List;

public class QuickyListResponse<T> {
	
   private List<T> items;

public QuickyListResponse(List<T> items) {
	super();
	this.items = items;
}

public QuickyListResponse() {
	super();
}

public List<T> getItems() {
	return items;
} 
   
   
}
