package com.example.starynight.dao;

import com.example.starynight.dto.SaveData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class SaveDataDAOStub implements ISaveData{
    HashMap<Integer, SaveData> saveDataItems = new HashMap<>();

    @Override
    public SaveData save(SaveData saveData) {
        saveDataItems.put(saveData.getId(), saveData);
        return saveData;
    }

    @Override
    public List<SaveData> getAll() {
        List<SaveData> saveDataList = new ArrayList<>(saveDataItems.values());
        return saveDataList;
    }

    @Override
    public SaveData get(int id) {
        return saveDataItems.get(id);
    }

    @Override
    public void delete(int id) {
        saveDataItems.remove(id);
    }
}
