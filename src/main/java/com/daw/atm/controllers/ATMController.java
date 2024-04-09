package com.daw.atm.controllers;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@EntityScan("com.daw.atm.model")
public class ATMController {
     
    @GetMapping("/")
    public String inici() {
        return "plantilla";
    }
}
