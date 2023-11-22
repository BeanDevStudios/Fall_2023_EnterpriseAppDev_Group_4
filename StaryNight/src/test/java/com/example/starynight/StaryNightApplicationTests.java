package com.example.starynight;

import dto.SaveData;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import service.ISavesService;

import java.util.Calendar;
import java.util.Date;

@SpringBootTest
class StaryNightApplicationTests {
	@Autowired
	private ApplicationContext context;

	@Test
	void contextLoads() {
		assertThat(context).isNotNull();
	}

	/**
	 * Tests the functionality where the application displays information
	 * based on the user's current location.
	 * <p>
	 * Steps:
	 * 1. Get the user's location.
	 * 2. Use the user's location to find information:
	 *    - Use API to gather star information.
	 *    - Organize star information.
	 *    - List stars at this location.
	 * </p>
	 * @throws Exception if any error occurs during the test
	 */
	@Test
	void displayInformationForUsersCurrentLocation() throws Exception {
		getTheUsersInformation();
		useAPIToGetInformationWithTheUsersLocation();
		displayTheInformationFoundWithTheUsersLocationToTheUser();
		//TODO: Add assertions or validations
	}

	private void getTheUsersInformation(){
		SaveData entry = new SaveData();
		Date fromDate = new Date(2023, Calendar.NOVEMBER,1);
		Date toDate = new Date(2023, Calendar.NOVEMBER,2);

		entry.setLatitude((float) -84.39733);
		entry.setLongitude((float) 33.775867);
		entry.setElevation(50);
		entry.setFromDate(fromDate);
		entry.setToDate(toDate);
		entry.setTime("08:00:00");

	}

	private void useAPIToGetInformationWithTheUsersLocation(){

	}

	private void displayTheInformationFoundWithTheUsersLocationToTheUser(){

	}

	/**
	 * Tests the functionality where the application displays information
	 * based on coordinates entered by the user.
	 * <p>
	 * Steps:
	 * 1. Get coordinates.
	 * 2. Use coordinates to find information:
	 *    - Use API to gather star information.
	 *    - Organize star information.
	 *    - List stars at this location.
	 * </p>
	 * @throws Exception if any error occurs during the test
	 */
	@Test
	void displayInformationForUsersChosenLocation() throws Exception{
		getTheUsersChosenLocation();
		useAPIToGetInformationWithTheUsersChosenLocation();
		displayTheInformationFoundWithTheUsersChosenLocationToTheUser();
		//TODO: Add assertions or validations
	}

	private void getTheUsersChosenLocation(){

	}

	private void useAPIToGetInformationWithTheUsersChosenLocation(){

	}

	private void displayTheInformationFoundWithTheUsersChosenLocationToTheUser(){

	}



	/**
	 * Tests the functionality for saving a search to an array list and
	 * sending this information to an external server.
	 * <p>
	 * Steps:
	 * 1. Collect the needed information for the save entry.
	 * 2. Save information into an array list.
	 * 3. Send saved information to an external storage place connected to the user's account.
	 * </p>
	 * @throws Exception if any error occurs during the test
	 */
	@Test
	void saveInformationForAUser() throws Exception{
		addAllInformationThatWasPresentedToTheUserToAnArrayList();
		sendInformationInTheArrayListToExternalServer();
		//TODO: Add assertions or validations
	}

	private void addAllInformationThatWasPresentedToTheUserToAnArrayList(){

	}

	private void sendInformationInTheArrayListToExternalServer(){

	}

	/**
	 * Tests the functionality for viewing and selecting past locations from saved searches.
	 * <p>
	 * Steps:
	 * 1. Present the user with the list of saved locations.
	 * 2. When the user selects a saved location, present that information to the user.
	 * </p>
	 * @throws Exception if any error occurs during the test
	 */
	@Test
	void whenAUserSelectsAnItemFromTheirSavedSearchesPresentTheSearchToTheUser(){
		getSavedSearchesFromEsternalServer();
		presentSavedSerchesToUser();
		PresentTheSearchInformationToTheUserWhenItemIsSelected();
		//TODO: Add assertions or validations
	}

	private void getSavedSearchesFromEsternalServer(){

	}

	private void presentSavedSerchesToUser(){

	}

	private void PresentTheSearchInformationToTheUserWhenItemIsSelected(){}

}
