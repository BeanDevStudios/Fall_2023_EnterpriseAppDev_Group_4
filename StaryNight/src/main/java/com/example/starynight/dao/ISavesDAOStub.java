package com.example.starynight.dao;

import java.util.List;

import com.example.starynight.dto.SaveData;

public interface ISavesDAOStub {

    /*
    * Save a new set of data
    */
    
    void save(SaveData saveData);

    /*
     * Return all save data
     * @return a collection of all saves
     */

    List<SaveData> fetchAll();
    
}
