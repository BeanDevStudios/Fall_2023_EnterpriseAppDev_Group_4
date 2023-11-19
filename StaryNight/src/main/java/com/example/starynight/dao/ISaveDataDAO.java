package com.example.starynight.dao;

import com.example.starynight.dto.SaveData;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public interface ISaveDataDAO {
    SaveData getById(int id);
    void deleteById(int id);
    List<SaveData> saveList(List<SaveData> saveDataList) throws ExecutionControl.NotImplementedException;
    ArrayList<SaveData> getAllSaveData();
}
