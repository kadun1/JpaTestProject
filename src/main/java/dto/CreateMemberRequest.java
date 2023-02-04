package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateMemberRequest {

    private String name;

    public CreateMemberRequest() {
        this.name = "test";
    }
}
