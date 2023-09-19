package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;

@Data
// 전체 getset
@AllArgsConstructor
// 전체 생성자
@NoArgsConstructor
// 기본 생성자
public class BookQueryParam {

        private String category;
        private String issuedYear;
        private String issuedMonth;
        private String issuedDay;
}
