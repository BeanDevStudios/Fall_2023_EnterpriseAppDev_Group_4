package service;

import dto.SaveData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SavesService implements ISavesService {

    ArrayList<SaveDataInput> allSaveData = new ArrayList<>();
    @Override
    public void save(SaveDataInput saveData) {
        allSaveData.add(saveData);
    }

    @Override
    public List<SaveDataInput> fetchAll() {
        return allSaveData;
    }
}
