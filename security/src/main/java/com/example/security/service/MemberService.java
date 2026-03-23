package com.example.security.service;



import java.util.List;
import com.example.security.entity.Member;


public interface MemberService {

    List<Member> getAllMembers();

    Member saveMember(Member member);

    Member getMemberbyId(Long id);

    void deleteMember(Long id);

}
