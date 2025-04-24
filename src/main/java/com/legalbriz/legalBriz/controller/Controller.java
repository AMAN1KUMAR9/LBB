package com.legalbriz.legalBriz.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legalbriz.legalBriz.dao.Dao;
import com.legalbriz.legalBriz.model.Lawyer;


@RestController
public class Controller {
    @Autowired
    private Dao dao;

    @GetMapping("/hey")
    public List<Lawyer> name (){
        return dao.findAll();
    }
}
