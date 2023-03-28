package com.learning.controller;

import com.learning.dao.SaveData;
import com.learning.dao.SaveEntity;
import com.learning.dao.SaveRequest;
import com.learning.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.Entity;

public class SaveController {
    @Autowired
    private SaveService saveService;

    @PostMapping("/Payload/ContactUs")
    ResponseEntity<?> save(@RequestBody SaveRequest saveRequest){
        SaveEntity saveEntity=new SaveEntity();
        saveEntity.setFirstName(saveRequest.getFirstName());
        saveEntity.setYourEmail(saveRequest.getYourEmail());
        saveEntity.setYourPhone(saveRequest.getYourPhone());
        saveEntity.setSubject(saveRequest.getSubject());
        saveEntity.setMessage(saveRequest.getMessage());
        try{
            saveService.save(saveEntity);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
