package it.API1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api01")
public class NameController {

    @GetMapping(value = "/{name}")
    public String getName(@PathVariable String name){
        return name;
    }

    @PostMapping(value = "/{name}")
    public String reverseName(@PathVariable String name){
        return new StringBuilder(name).reverse().toString();
    }
}
