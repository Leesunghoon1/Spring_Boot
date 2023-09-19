package com.example.restapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.UserRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {

	@Autowired //스프링 관리하는 빌드중에 자동으로 생성되는 오브젝트를 가져오는 메소드

	private ObjectMapper objectMapper;

	@Test
	void contextLoads() throws JsonProcessingException {

//	var user = new UserRequest("홍길동", 10, "hong@gmain.com", true);
	//System.out.println(user);

	//user.setUserName("홍길동");
	//user.setUserAge(10);
	//user.setEmail("hong@gmail.com");
	//user.setIsKorean(true);

	var json = "{\"user_names\":\"홍길동\",\"user_age\":10,\"email\":\"hong@gmain.com\",\"is_korean\":true}";
		System.out.println(json); // 제이슨으로 만들기


		var dto = objectMapper.readValue(json, UserRequest.class);
		System.out.println(dto); // 제이슨을 dto로 바꿀때는 set을 반영 set이 없으면 get을 반영
	}

}
