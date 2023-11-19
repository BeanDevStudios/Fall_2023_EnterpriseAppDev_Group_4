package com.example.starynight.dao;

import com.example.starynight.dto.SaveData;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SaveDataDAOStub implements ISaveDataDAO {

    HashMap<Integer, SaveData> saveDataHashMap = new HashMap<>();

    @Override
    public SaveData getById(int id) {
        return saveDataHashMap.get(id);
    }

    @Override
    public void deleteById(int id) {
        saveDataHashMap.remove(id);
    }

    @Override
    public List<SaveData> saveList(List<SaveData> saveDataList) throws ExecutionControl.NotImplementedException {
        return null;
    }

    @Override
    public ArrayList<SaveData> getAllSaveData() {
        return new ArrayList<SaveData>(saveDataHashMap.values());
    }
}
