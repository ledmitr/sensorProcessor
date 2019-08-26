package ru.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildingController {

    @RequestMapping("/")
    public String test() {
        return "Hello world!";
    }
}
