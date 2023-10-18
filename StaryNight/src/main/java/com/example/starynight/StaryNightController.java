package com.example.starynight;

import org.springframework.web.bind.annotation.RequestMapping;

public class StaryNightController {

    /**
     * Handles the root endpoint request.
     *
     * @return The name of the view to be rendered.
     */
    @RequestMapping("/")
    public String index(){
        return "start";
    }
}
