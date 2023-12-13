package com.example.starynight.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.starynight.dto.SaveData;

@Repository
public class SavesDAOStub implements ISavesDAOStub {

    ArrayList<SaveData> allSaveData = new ArrayList<>();
    
    @Override
    public void save(SaveData saveData) {
        allSaveData.add(saveData);
    }

    @Override
    public List<SaveData> fetchAll() {
        return allSaveData;
    }
}
