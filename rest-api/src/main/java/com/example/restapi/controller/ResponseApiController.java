//package com.example.restapi.controller;
//
//import lombok.extern.slf4j.Slf4j;
//import model.UserRequest;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Slf4j
//// @RestController // 응답을 json을 받겠다
//@Controller
//@RequestMapping("/api/v1")
//public class ResponseApiController {
//
//
//    // http://localhost:8080/api/v1
//    @GetMapping("")
////    @RequestMapping(path = "", method = RequestMethod.GET)
////    @ResponseBody
//    public UserRequest user() {
//
//        var user = new UserRequest();
//
//        user.setUserName("홍길동");
//        user.setUserAge(10);
//        user.setEmail("hong@gmail.com");
//
//        log.info("user: {}", user);
//
//        var response = ResponseEntity // 에러 조작
//                .status(HttpStatus.BAD_REQUEST)
//                .header("x-custom", "hi")
//                .body(user);
//
//        return user;
//    }
//}
