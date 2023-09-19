package com.example.restapi.controller;

import lombok.extern.slf4j.Slf4j;
import model.UserRequest;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/api")
public class PutApiController {
    @PutMapping("/put")
    public void put(
            @RequestBody
            UserRequest userRequest
    ){
        System.out.println("");
        log.info("Request : {}", userRequest);
    }
}
