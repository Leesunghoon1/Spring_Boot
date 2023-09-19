package com.example.validation.controller;

import com.example.validation.model.Api;
import com.example.validation.model.UserRehisterRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController {

    // MethodArgumentNotValidException

    @PostMapping("")
    public Api<UserRehisterRequest> register( //오브젝트를 상속받은 모든 값을 리턴할꺼야

            @Valid
            @RequestBody
            Api<UserRehisterRequest> userRehisterRequest,

            BindingResult bindingResult //에러를 바인딩 리절트에 담는다

    ) {

        log.info("init : {}", userRehisterRequest);



//        if(bindingResult.hasErrors()) { //에러 검사
//
//        }


        var body = userRehisterRequest.getData();

        Api<UserRehisterRequest> respons =  Api.<UserRehisterRequest>builder()
                .resultCode(String.valueOf(HttpStatus.OK.value()))
                .resultMessage(HttpStatus.OK.getReasonPhrase())
                .data(body)
                .build();

        return respons;
    }
}
