package com.example.SpringBoot.CRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class bookController {

    @RequestMapping(value = "/")
    public String getBooks(){
        return "home";
    }

}

