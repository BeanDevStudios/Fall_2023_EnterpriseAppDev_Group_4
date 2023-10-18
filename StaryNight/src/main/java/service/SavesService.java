package service;

import dto.SaveData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SavesService implements ISavesService {

    List<SaveData> allSaveData = new ArrayList<>();
    @Override
    public void save(SaveData saveData) {
        allSaveData.add(saveData);
    }

    @Override
    public List<SaveData> fetchAll() {
        return allSaveData;
    }
}
