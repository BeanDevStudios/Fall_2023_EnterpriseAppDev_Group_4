package com.starynight.service;

import com.starynight.dto.SaveData;
import java.util.List;
public interface ISavesService {

    /*
    * Save a new set of data
    * @param saveData the data to be saved
    */
    default void save(SaveData saveData) {

    }

    /*
     * Return all save data
     * @return a collection of all saves
     */
    List<SaveData> fetchAll();
}
