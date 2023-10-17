package com.example.session.servcie;

import com.example.session.db.UserRepository;
import com.example.session.model.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // 로그인 로직 처리구간
    public void login(

            LoginRequest loginRequest,

            HttpSession httpSession

    ) {
        var id = loginRequest.getId();
        var pw = loginRequest.getPassword();

        var optionalUser = userRepository.findByName(id);

        if(optionalUser.isPresent()) {
            var userDto = optionalUser.get();
            if(userDto.getPassword().equals(pw)) {
                //세선에 정보저장
                httpSession.setAttribute("USER", userDto);

            }else {
                throw new RuntimeException("Password Not Match");
            }
        }else{
            //없는유저
            throw new RuntimeException("User Not Found");
        }
    }
}
