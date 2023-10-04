package com.example.starynight;

import org.springframework.web.bind.annotation.RequestMapping;

public class StaryNightController {

    /*
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "start";
    }
}
