package com.starynight;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaryNightController {

    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "start";
    }
}
