package com.me.visualizer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.me.visualizer.StockWrapperRepository;
import com.me.visualizer.model.StockWrapper;

@RestController
public class Controller {

    @Autowired
    StockWrapperRepository repo;
    
    @GetMapping("/Wrappers")
    public List<StockWrapper> getAllStocks() {
        return repo.findAll();
    }
}
