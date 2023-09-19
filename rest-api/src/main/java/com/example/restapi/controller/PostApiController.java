package com.example.restapi.controller;

import model.BookRequest;
import model.UserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostApiController {

    // http://localhost:8080/api/post
    @PostMapping("/post")
    public String post(
            @RequestBody BookRequest bookRequest
    ) {
        System.out.println(bookRequest);
        return bookRequest.toString();
    }

    @PostMapping("/User")
    public UserRequest User(
            @RequestBody
            UserRequest userRequest
    ){
        System.out.println(userRequest);
        return userRequest;
    }


}
