package com.example.ben_api.controllers;

import com.example.ben_api.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/data")
    public ResponseEntity<String> getData() {
        String data = dataService.fetchData();
        return ResponseEntity.ok().body(data);
    }
}

