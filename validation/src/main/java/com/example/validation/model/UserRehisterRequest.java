package com.example.validation.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserRehisterRequest {

    @NotBlank // != bull && name != "" && name != "  "
    private String name;

    private String nickName;

    @Size(min = 1, max = 12)
    @NotBlank
    private Integer age;

    @NotBlank
    @Min(1)
    @Max(100)
    private String email;

//    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", massage = "휴대폰 번호 양식에 맞지 않습니다.")
    private String phoneNumber;

    private LocalDateTime registerAt;

    @AssertTrue(message = "name or nickName 은 존재해야합니다.")
    public boolean isnameCheck() {

        if(Objects.nonNull(name) && !name.isBlank()) {
            return true;
        }
        if(Objects.nonNull(nickName) && !name.isBlank()) {
            return true;
        }

        return false;
    }
}
