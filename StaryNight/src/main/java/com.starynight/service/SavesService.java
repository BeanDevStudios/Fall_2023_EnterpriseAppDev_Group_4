package com.starynight.service;

import com.starynight.dto.SaveData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SavesService implements ISavesService {
    @Autowired
    private com.starynight.service.SavesService savesDAO;

    public SavesService(){

    }

    public SavesService(com.starynight.service.ISavesDAO savesDAO){
        this.savesDAO = (SavesService) savesDAO;
    }

    @Override
    public void save(SaveData saveData) {
        savesDAO.save(saveData);
    }

    @Override
    public List<SaveData> fetchAll() {
        return savesDAO.fetchAll();
    }
}
