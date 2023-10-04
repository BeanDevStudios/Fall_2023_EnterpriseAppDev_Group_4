package com.example.starynight;

import dto.Location;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StaryNightApplicationTests {

	//Variables
	private Location location = new Location();

	@Test
	void contextLoads() {
	}

	//Test #1
	//When the user opens the application, the app will display information on the users current location
		//Step 1 - Get users location
		//Step 2 - Use users location to find information
			// Use API to gather star information
			// Organize star information
			// List stars at this location
	@Test
	void displayInformationForUsersCurrentLocation() throws Exception {
		getTheUsersLocation();
		useAPIToGetInformationWithTheUsersLocation();
		displayTheInformationFoundWithTheUsersLocationToTheUser();
	}

	private void getTheUsersLocation(){

	}

	private void useAPIToGetInformationWithTheUsersLocation(){

	}

	private void displayTheInformationFoundWithTheUsersLocationToTheUser(){

	}

	//Test #2
	//When the user enters coordinates, the app will display information in relation to those coordinates
		//Step 1 - Get coordinates
		//Step 2 - Use coordinates to find information
			// Use API to gather star information
			// Organize star information
			// List stars at this location
	@Test
	void displayInformationForUsersChosenLocation() throws Exception{
		getTheUsersChosenLocation();
		useAPIToGetInformationWithTheUsersChosenLocation();
		displayTheInformationFoundWithTheUsersChosenLocationToTheUser();

	}

	private void getTheUsersChosenLocation(){

	}

	private void useAPIToGetInformationWithTheUsersChosenLocation(){

	}

	private void displayTheInformationFoundWithTheUsersChosenLocationToTheUser(){

	}



	//Test #3
	//When the user wants to save a search, the app will add the entry to an arraylist

	//Test #4
	//When a user wants to look at past locations, they will be able to view a saved location list.

}
