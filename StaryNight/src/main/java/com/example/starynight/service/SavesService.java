package com.example.starynight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.starynight.dao.ISavesDAOStub;
import com.example.starynight.dto.SaveData;

import java.util.List;
@Service
public class SavesService implements ISavesService {

    @Autowired
    private ISavesDAOStub savesDAOStub;
    
    public SavesService(ISavesDAOStub savesDAOStub) { this.savesDAOStub = savesDAOStub;}

    @Override
    public void save(SaveData saveData) {
        savesDAOStub.save(saveData);
    }
    
    @Override
    public List<SaveData> fetchAll() {
        return savesDAOStub.fetchAll();
    }
}
