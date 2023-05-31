package com.example.jackson.adapter.web.controllers;

import com.example.jackson.dto.OneFieldDto;
import com.example.jackson.dto.TwoFieldDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    /*
    {
        "field": "field"
    }
    */
    @PostMapping("/one")
    //это падает без JacksonConfig
    public OneFieldDto oneFieldBody(@RequestBody OneFieldDto oneFieldDto) {
        return oneFieldDto;
    }

    /*
    {
        "firstField": "field",
        "secondField": "field"
    }
    */
    @PostMapping("/two")
    //а это уже не падает
    public TwoFieldDto twoFieldBody(@RequestBody TwoFieldDto twoFieldDto) {
        return twoFieldDto;
    }
}
