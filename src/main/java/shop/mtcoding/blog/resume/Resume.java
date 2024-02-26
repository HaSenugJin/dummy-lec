package shop.mtcoding.blog.resume;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Table(name="resume_tb")
@Data
@Entity // 테이블 생성하기 위해 필요한 어노테이션
public class Resume {
    @Id // PK 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 전략
    private Integer id;
    private Integer userId; // 테이블에 만들어 질때 user_id
    private String title;
    private String career;
    private String edu;
    private String area;
    private String position;
    // private class Skill skillStack;

    private String intro;
    private String link;
    private Timestamp createdAt;
}
