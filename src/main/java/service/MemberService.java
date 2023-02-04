package service;

import domain.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberService {
    public Long join(Member member) {
        return member.getId();
    }

    public List<Member> findMembers() {

        return new ArrayList<Member>();
    }
}
