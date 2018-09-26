package com.fypcdr.cloudapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/")
public class ClientController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String TestUrl(){
        return "Welcome to Cloud integrator";
    }


}