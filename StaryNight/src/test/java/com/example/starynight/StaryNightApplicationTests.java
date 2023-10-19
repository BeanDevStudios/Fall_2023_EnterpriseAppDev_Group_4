package com.example.starynight;

import dto.SaveData;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import service.ISavesService;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootTest
class StaryNightApplicationTests {

	//Variables
	@Autowired
	private ISavesService saveService;
	private SaveData saveData = new SaveData();

	@Test
	void contextLoads() {
	}

	/*
	* Test #1
	* When the user opens the application, the app will display information on the users current location
	* 	Step 1 - Get users location
	* 	Step 2 - Use users location to find information
    * 		Use API to gather star information
	* 		Organize star information
	* 		List stars at this location
	*/
	@Test
	void displayInformationForUsersCurrentLocation() throws Exception {
		getTheUsersInformation();
		useAPIToGetInformationWithTheUsersLocation();
		displayTheInformationFoundWithTheUsersLocationToTheUser();
	}

	private void getTheUsersInformation(){
		SaveDataInput entry = new SaveDataInput();
		Date fromDate = new Date(2023, Calendar.NOVEMBER,1);
		Date toDate = new Date(2023, Calendar.NOVEMBER,2);
		float latitude = -84.39733;
		float longitude = 33.775867;
		int elevation = 50;
		string time = "08:00:00";

		//Set object properties
		entry.setLatitude((float) latitude);
		entry.setLongitude((float) longitude);
		entry.setElevation(elevation);
		entry.setFromDate(fromDate);
		entry.setToDate(toDate);
		entry.setTime(time);

		//Make sure object can properly get and set Values
		assertEquals(latitude, entry.getLatitude());
		assertEquals(longitude, entry.getLongitude());
		assertEquals(elevation, entry.getElevation());
		assertEquals(fromDate, entry.getFromDate());
		assertEquals(toDate, entry.getToDate());
		assertEquals(time, entry.getTime());

	}
	
	/**
	 * Validate that the SavesService can save and return a list of SaveDataInput.
	 */
	@Test
	void verifyAddAndRemoveSaveDataInputs() {
		SaveDataInput entry = new SaveDataInput();
		Date fromDate = new Date(2023, Calendar.NOVEMBER,1);
		Date toDate = new Date(2023, Calendar.NOVEMBER,2);
		float latitude = -84.39733;
		float longitude = 33.775867;
		int elevation = 50;
		string time = "08:00:00";

		//Set object properties
		entry.setLatitude((float) latitude);
		entry.setLongitude((float) longitude);
		entry.setElevation(elevation);
		entry.setFromDate(fromDate);
		entry.setToDate(toDate);
		entry.setTime(time);

		saveService.save(entry);

		List<SaveDataInput> saveDataInputs = saveService.fetchAll();
		boolean saveDataPresent = false;
		for (SaveDataInput sdi : saveDataInputs) {
			if (sdi.getFromDate().equals(fromDate) && sdi.getElevation().equals(elevation)) {
				saveDataPresent = true;
				break;
			}
		}

		assertTrue(saveDataPresent);


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
