package com.winter.app.locations;

public class LocationService {
		private LocationDAO locationDAO = new LocationDAO();
	
	public void setLocationDAO (LocationDAO locationDAO) {
				this.locationDAO = locationDAO;
	}

}