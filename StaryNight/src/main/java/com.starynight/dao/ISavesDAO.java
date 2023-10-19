package com.starynight.service;

import com.starynight.dto.SaveData;
import java.util.List;

public interface ISavesDAO {
    void save(SaveData saveData);
    List<SaveData> fetchAll();
}