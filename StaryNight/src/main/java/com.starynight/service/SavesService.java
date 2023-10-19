package com.starynight.service;

import com.starynight.dto.SaveData;
import com.starynight.dao.ISavesDAO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SavesService implements ISavesService {
    @Autowired
    private ISavesDAO savesDAO;

    public SavesService(){

    }

    public SavesService(ISavesDAO savesDAO){
        this.savesDAO = savesDAO;
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
