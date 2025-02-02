package com.example.counter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")  // Autoriser toutes les origines (à restreindre en production)
@RestController
@RequestMapping("/api/counter")
public class CounterController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping
    public int getCounter() {
        String sql = "SELECT cvalue FROM counters WHERE id = 1";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @PostMapping("/increment")
    public void incrementCounter() {
        String sql = "UPDATE counters SET cvalue = cvalue + 1 WHERE id = 1";
        jdbcTemplate.update(sql);
    }
}
