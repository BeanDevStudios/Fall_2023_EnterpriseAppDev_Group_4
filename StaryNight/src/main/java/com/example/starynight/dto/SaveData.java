package com.example.starynight.dto;


import lombok.Data;

import java.util.Date;

public @Data
class SaveData {

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
