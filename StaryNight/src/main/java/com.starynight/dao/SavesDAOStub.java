package com.starynight.service;

import com.starynight.dto.SaveData;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ISavesDAO {
    List<SaveData> allSaveData = new ArrayList<SaveData>();

    @Override
    public void save(SaveData saveData){
        allSaveData.add(saveData);
    }

    @Override
    public List<SaveData> fetchAll(){
        return allSaveData;
    }
}