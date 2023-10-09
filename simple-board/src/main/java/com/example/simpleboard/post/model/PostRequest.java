package com.example.simpleboard.post.model;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostRequest {


    private String userName;

    private String password;

    private String email;

    private String title;

    private String content;
}
