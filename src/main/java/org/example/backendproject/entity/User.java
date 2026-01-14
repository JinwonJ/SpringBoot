//package org.example.backendproject.entity;
//
//import jakarta.persistence.*;
//import org.hibernate.annotations.Comment;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "user_info")
//@EntityListeners(AuditingEntityListener.class)
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Comment("사용자키")
//    private long user_key;
//
//    @Comment("패스워드")
//    private String password;
//
//    @Comment("사용자이름")
//    @Column(length = 100)
//    private String first_name;
//
//    @Comment("사용자성")
//    @Column(length = 100)
//    private String last_name;
//
//    @Comment("생년월일")
//    @Column(length = 8)
//    private int birth; // YYYYMMDD
//
//    @Comment("이메일")
//    @Column(unique = true)
//    private String email;
//
//    @Comment("핸드폰번호")
//    @Column(unique = true)
//    private String phone;
//
//    @CreatedDate
//    @Comment("생성날짜")
//    private LocalDateTime reg_dt;
//
//    @Comment("수정날짜")
//    private LocalDateTime modi_dt;
//
//    @Comment("로그인날짜")
//    private LocalDateTime login_dt;
//}
