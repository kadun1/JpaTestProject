package dto;

import lombok.RequiredArgsConstructor;

public class CreateMemberResponse {

    private Long id;

    public CreateMemberResponse(Long id) {
        this.id = id;
        System.out.println(id);
    }
}
