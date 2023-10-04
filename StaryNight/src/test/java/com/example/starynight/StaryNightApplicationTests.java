package com.example.starynight;

import dto.SaveData;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StaryNightApplicationTests {

	//Variables
	private SaveData saveData = new SaveData();

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
		//Step 1 - Collect the needed information for the save entry
		//Step 2 - Save information into an array list
		//Step 3 - Send saved information to an external storage place connected to the users account
	@Test
	void saveInformationForAUser() throws Exception{
		addAllInformationThatWasPresentedToTheUserToAnArrayList();
		sendInformationInTheArrayListToExternalServer();
	}

	private void addAllInformationThatWasPresentedToTheUserToAnArrayList(){

	}

	private void sendInformationInTheArrayListToExternalServer(){

	}

	//Test #4
	//When a user wants to look at past locations, they will be able to view a saved location list.
		//Step 1 - Present the user with the list of saved locations
		//Step 2 - When the user selects a saved location, present that information to the user
	@Test
	void whenAUserSelectsAnItemFromTheirSavedSearchesPresentTheSearchToTheUser(){
		getSavedSearchesFromEsternalServer();
		presentSavedSerchesToUser();
		PresentTheSearchInformationToTheUserWhenItemIsSelected();
	}

	private void getSavedSearchesFromEsternalServer(){

	}

	private void presentSavedSerchesToUser(){

	}

	private void PresentTheSearchInformationToTheUserWhenItemIsSelected(){}

}
