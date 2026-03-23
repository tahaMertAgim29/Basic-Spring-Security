package com.example.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.service.MemberService;
import java.util.List;


import com.example.security.entity.Member;

@RestController
@RequestMapping("/api")
public class MemberController {

    private final MemberService service;

    public MemberController(MemberService service) {
        this.service = service;
    }

    @GetMapping("/members")
    public List<Member> getAllMembers() {
        return this.service.getAllMembers();
    }

    @GetMapping("/member/{id}")
    public Member getMemberbyId(@PathVariable Long id) {
        return this.service.getMemberbyId(id);
    }

    @PostMapping("/member/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Member saveMember(@RequestBody Member member) {
        return this.service.saveMember(member);
    }

    @DeleteMapping("/member/del/{id}")
    public void deleteMember(@PathVariable Long id) {
        this.service.deleteMember(id);
    }
}
