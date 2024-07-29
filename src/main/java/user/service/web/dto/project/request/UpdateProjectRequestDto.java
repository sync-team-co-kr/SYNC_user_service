package user.service.web.dto.project.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UpdateProjectRequestDto {
    @NotEmpty(message = "프로젝트 아이디는 필수 입력 값 입니다.")
    private Long projectId;
    @NotBlank(message = "프로젝트 설명은 필수 입력 값 입니다.")
    private String description;
    @NotBlank(message = "제목은 필수 입력 값 입니다.")
    private String title;
    @NotBlank(message = "부제목은 필수 입력 값 입니다.")
    private String subTitle;
    @NotBlank(message = "시작일은 필수 입력 값 입니다.")
    private Date startDate;
    @NotBlank(message = "종료일은 필수 입력 값 입니다.")
    private Date endDate;
}