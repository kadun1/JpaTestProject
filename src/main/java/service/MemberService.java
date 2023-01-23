package service;

import domain.Member;

public class MemberService {
    public Long join(Member member) {
        return member.getId();
    }
}
