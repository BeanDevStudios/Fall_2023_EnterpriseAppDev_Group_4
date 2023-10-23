package com.starynight.dao;

import com.starynight.dto.SaveData;

import java.util.ArrayList;
import java.util.List;

public interface ISaveDataDAO {
    List<SaveData> allSaveData = new ArrayList<SaveData>();
    void save(SaveData saveData);

    List<SaveData> fetchAll();
}
