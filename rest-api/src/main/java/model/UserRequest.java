package model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;


//@Getter
@Data // 해당 클래스가 있는 메소드 자동
@AllArgsConstructor // 앞으로 추가할 전체생성자 추가
//@NoArgsConstructor // 기본생성자 추가
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)


public class UserRequest {

        private String userName;


        private Integer userAge;

        private String email;


        public Boolean isKorean; // is_korean

        private UserRequest(){

        }


        @Override
        public String toString() {
                return "UserRequest{" +
                        "userName='" + userName + '\'' +
                        ", userAge=" + userAge +
                        ", email='" + email + '\'' +
                        ", isKorean=" + isKorean +
                        '}';
        }
}
