package com.example.security.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.security.entity.Member;
import com.example.security.exception.MemberNotFoundException;
import com.example.security.repository.MemberRepository;

@Service
public class MemberServiceImp implements MemberService {

    private final MemberRepository repository;

    public MemberServiceImp(MemberRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Member> getAllMembers() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }

    @Override
    public Member saveMember(Member member) {
        // TODO Auto-generated method stub
        return repository.save(member);
    }

    @Override
    public Member getMemberbyId(Long id) {
        // TODO Auto-generated method stub
        return repository.findById(id).orElseThrow(() -> new MemberNotFoundException(id));
    }

    @Override
    public void deleteMember(Long id) {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }

}
