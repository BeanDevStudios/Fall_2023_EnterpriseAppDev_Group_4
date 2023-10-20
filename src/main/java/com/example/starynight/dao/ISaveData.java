package com.example.starynight.dao;

import com.example.starynight.dto.SaveData;

import java.util.List;

public interface ISaveData {
    SaveData save(SaveData saveData);
    List<SaveData> getAll();
    SaveData get(int id);
    void delete(int id);
}
