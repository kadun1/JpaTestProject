package dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
public class MemberDto {
    private String name;

    public MemberDto(String name) {
        this.name = name;
    }
}
