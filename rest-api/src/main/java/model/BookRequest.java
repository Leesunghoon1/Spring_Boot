package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 해당 클래스가 있는 메소드 자동
@AllArgsConstructor // 앞으로 추가할 전체생성자 추가
@NoArgsConstructor // 기본생성자 추가
public class BookRequest {

    private String name;

    private String number;

    private String cetegory;
}
