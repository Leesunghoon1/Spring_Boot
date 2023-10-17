package com.example.session.db;


import com.example.session.model.UserDto;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserRepository {

    private List<UserDto> userList = new ArrayList<>();

    public Optional<UserDto> findByName(String name) {
        //사용자의 이름을 찾아서 넘어온 이름과 해당 스트림에 들어있는 이름중에 필터를 걸어서
        //같은 이름이 있으면 제일 첫번째 이름을 찾아서 리턴을 해준다
        return userList.stream().filter(it -> {
           return it.getName().equals(name);
        }).findFirst();
    }

    @PostConstruct
    public void init() {

        userList.add(
               new UserDto(
                        "홍길동",
                       "1234"
                )

        );

        userList.add(
                new UserDto(
                        "유관순",
                        "1234"
                )

        );

        userList.add(
                new UserDto(
                        "몽몽이",
                        "1234"
                )

        );


    }

}
