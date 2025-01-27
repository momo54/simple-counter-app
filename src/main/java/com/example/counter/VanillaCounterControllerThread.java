package com.example.counter;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")  // Autoriser toutes les origines (à restreindre en production)
@RestController
@RequestMapping("/thread/counter")
public class VanillaCounterControllerThread {    
    public static int count=0;
    @GetMapping
    public int getCounter() {
        return count;
    }

    @PostMapping("/increment")
    public void incrementCounter() {
        int x=count;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count=x+1;
    }
}
