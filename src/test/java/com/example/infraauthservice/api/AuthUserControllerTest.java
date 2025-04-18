package com.example.infraauthservice.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthUserControllerTest {

    @Test
    @DisplayName("이메일 회원 가입")
    public void email_sign_up() {
        // 단순 사용자 정보 저장
    }

    @Test
    @DisplayName("SNS 회원 가입")
    public void sns_sign_up() {
        // OAuth를 통해 SNS 계정과 연동
    }

    @Test
    @DisplayName("이메일 가입 회원 탈퇴")
    public void delete_email_sign_up_user() {
        // 테이블 데이터 제거
    }

    @Test
    @DisplayName("SNS 회원 탈퇴")
    public void delete_sns_sign_up_user() {
        // 테이블 데이터 제거 --> SNS 연동 해제
    }

    @Test
    @DisplayName("비밀번호 변경")
    public void change_password() {
        // 비밀번호 변경
    }
}
