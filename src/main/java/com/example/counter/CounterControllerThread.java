package com.example.counter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")  // Autoriser toutes les origines (à restreindre en production)
@RestController
@RequestMapping("/conc/counter")
public class CounterControllerThread {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping
    public int getCounter() {
        String sql = "SELECT value FROM counter WHERE id = 1";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @PostMapping("/increment")
    public void incrementCounter() {
        int x=getCounter();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String sql = "UPDATE counter SET value = "+(x+1)+" WHERE id = 1";
        jdbcTemplate.update(sql);
    }
}
