package com.example.starynight.dao;

import com.example.starynight.dto.SaveData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class SaveDataDAOStub implements ISaveData{

    //Memory storage for the SaveData items
    HashMap<Integer, SaveData> saveDataItems = new HashMap<>();

    /**
     * Saves the given SaveData object
     * @param saveData The saveData object to be saves
     * @return The saveData object that was saved
     */
    @Override
    public SaveData save(SaveData saveData) {
        saveDataItems.put(saveData.getId(), saveData);
        return saveData;
    }

    /**
     * Retrieves all saveData items from the hashmap
     * @return A list of the SaveData objects
     */
    @Override
    public List<SaveData> getAll() {
        List<SaveData> saveDataList = new ArrayList<>(saveDataItems.values());
        return saveDataList;
    }

    /**
     * Returns a specific SaveData object, given the specific ID from the hashmap
     * @param id The ID of the SaveData object to be returned
     * @return The SaveData object if found, otherwise null
     */
    @Override
    public SaveData get(int id) {
        return saveDataItems.get(id);
    }

    /**
     * Deletes the specific SaveData object from the HashMap with the given ID
     * @param id The ID of the SaveData object to be deleted
     */
    @Override
    public void delete(int id) {
        saveDataItems.remove(id);
    }
}
