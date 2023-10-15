package com.example.simpleboard.post.controller;


import com.example.simpleboard.post.db.PostEntity;
import com.example.simpleboard.post.model.PostRequest;
import com.example.simpleboard.post.model.PostViewRequest;
import com.example.simpleboard.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/post")
//포스트라는 주소 갖기
@RequiredArgsConstructor
public class PostApiController {

    private final PostService postService;
    //서버가지기

    @PostMapping("")
    //기본주소
    public PostEntity create(
            @Valid
            @RequestBody
            PostRequest postRequest
            //요청되는 포스트메핑을 valid로 검증
    ) {
        return postService.create(postRequest);
    }


    @PostMapping("/view")
    public PostEntity view(
            @Valid
        @RequestBody PostViewRequest postViewRequest
            ){
        return postService.view(postViewRequest);
    }

    @GetMapping("/all")
    public List<PostEntity> list(


    ) {
        return postService.all();
    }

    @PostMapping("delete")
    public void delete(
            @Valid
            @RequestBody PostViewRequest postViewRequest
    ){
        postService.delete(postViewRequest);
    }
}
