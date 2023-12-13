package com.example.starynight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.starynight.dto.SaveData;
import com.example.starynight.service.SavesService;

@Controller
public class StaryNightController {

    @Autowired
    private SavesService savesService;

    /*
     * Handle the / endpoint
     * @return
     */

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/savedAreaInfo")
    public ResponseEntity savedAreaInfo(SaveData data){
        try{
            savesService.save(data);
            return new ResponseEntity(HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }
}
