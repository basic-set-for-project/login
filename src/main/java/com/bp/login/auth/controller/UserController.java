package com.bp.login.auth.controller;

import com.bp.login.auth.dto.SigninReq;
import com.bp.login.auth.dto.SignupReq;
import com.bp.login.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
    * 로그인
    * */
    @PostMapping("/user/login")
    public ResponseEntity<?> login(@RequestBody @Valid SigninReq signinReq ) throws Exception {
        return userService.login(signinReq);
    }

    /**
     * 회원가입
     * */
    @PostMapping("/user/signup")
    public ResponseEntity<?> signup(@RequestBody @Valid SignupReq signupReq) {
        return userService.signup(signupReq);
    }
}
