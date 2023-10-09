package com.example.simpleboard.reply.db;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Entity(name = "reply")
public class ReplyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long postId;

    private String userName;

    private String password;

    private String status;

    private String title;

    @Column(columnDefinition = "TEXT") //속성을 맞춰줄수있음 컬럼으로
    private String content;

    private LocalDateTime repliedAt;
}
