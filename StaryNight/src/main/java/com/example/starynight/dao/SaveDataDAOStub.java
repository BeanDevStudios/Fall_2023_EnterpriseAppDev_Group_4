package com.example.starynight.dao;

import com.example.starynight.dto.SaveData;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A stub implementation of ISaveDataDAO for testing purposes.
 * This class uses a HashMap to mimic database operations in memory.
 */
public class SaveDataDAOStub implements ISaveDataDAO {

    // HashMap to store save data objects, keyed by their ID.
    private final HashMap<Integer, SaveData> saveDataHashMap = new HashMap<>();

    /**
     * Retrieves a SaveData object by its ID.
     *
     * @param id The ID of the SaveData object.
     * @return The SaveData object if found, otherwise null.
     */
    @Override
    public SaveData getById(int id) {
        return saveDataHashMap.get(id);
    }

    /**
     * Deletes a SaveData object by its ID.
     *
     * @param id The ID of the SaveData object to delete.
     */
    @Override
    public void deleteById(int id) {
        saveDataHashMap.remove(id);
    }

    /**
     * Saves a list of SaveData objects. (Not implemented in this stub)
     *
     * @param saveDataList The list of SaveData objects to save.
     * @return Currently returns null.
     * @throws ExecutionControl.NotImplementedException Always thrown as this is a stub.
     */
    @Override
    public List<SaveData> saveList(List<SaveData> saveDataList) throws ExecutionControl.NotImplementedException {
        // Implementation should go here.
        throw new ExecutionControl.NotImplementedException("Method not implemented.");
    }

    /**
     * Retrieves all SaveData objects.
     *
     * @return A list of all SaveData objects.
     */
    @Override
    public ArrayList<SaveData> getAllSaveData() {
        return new ArrayList<>(saveDataHashMap.values());
    }
}
