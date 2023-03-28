package com.learning.service;

import com.learning.dao.SaveData;
import com.learning.dao.SaveEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveService {
    @Autowired
    private SaveData saveData;


    public void save(SaveEntity saveEntity){
        saveData.save(saveEntity);
    }


}
