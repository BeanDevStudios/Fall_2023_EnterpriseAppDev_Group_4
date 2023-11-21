package dto;


import lombok.Data;

import java.util.Date;

public @Data
//Renaming this class because the current name can be interpreted as an action.
    //I added input to the end to describe how the class is used...as input parameters to the API.
class SaveDataInput {

    /*
    * These are the needed parameters to pull our data
    *
    * We will be saving the search criteria rather than the information
    * retrieved from the API to save space
    *
    * When a user wants to pull up information from their saved list,
    * the application will take the search criteria and search for it again
    */
    private Float latitude;
    private Float longitude;
    private Integer elevation;
    private Date fromDate;
    private Date toDate;
    private String time;
}
