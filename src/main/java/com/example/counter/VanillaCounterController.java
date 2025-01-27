package com.example.counter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")  // Autoriser toutes les origines (à restreindre en production)
@RestController
@RequestMapping("/vanilla/counter")
public class VanillaCounterController {    
    public static int count=0;
    @GetMapping
    public int getCounter() {
        return count;
    }

    @PostMapping("/increment")
    public void incrementCounter() {
        count=count+1;
    }
}
