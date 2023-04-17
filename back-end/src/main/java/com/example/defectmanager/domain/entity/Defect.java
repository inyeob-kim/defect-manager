package com.example.defectmanager.domain.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Table(name = "defects")
@NoArgsConstructor // 5
@Entity // 1
public class Defect {

    @Id // 2
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 3
    private Long id;

    @Column(length = 500, nullable = false) // 4
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(length = 1, nullable = false)
    private String type;

    @Column(length = 1, nullable = false)
    private String status;

    @Column(length = 1, nullable = false)
    private String priority;

    @Column(length = 1, nullable = false)
    private String severity;

    @Column(nullable = false)
    private Long defectRegistrantId;

    @Column(nullable = false)
    private Long defectHandlerId;

    @Builder // 7
    public Defect(String title, String content, String type, String status, String priority, String severity, Long defectRegistrantId, Long defectHandlerId) {
        this.title = title;
        this.content = content;
        this.type = type;
        this.status = status;
        this.priority = priority;
        this.severity = severity;
        this.defectRegistrantId = defectRegistrantId;
        this.defectHandlerId = defectHandlerId;
    }
}

/**
 * 1. 테이블과 링크될 클래스임을 나타냄
 * ex) Defect.java -> defect table
 * <p>
 * 2. 해당 테이블의 PK
 * <p>
 * 3. PK의 생성 규칙 나타냄
 * 스프링 부트 2.0 에서는 GenerationType.IDENTITY 옵션을 추가해야만 auto_increment 가 됨
 * <p>
 * 4. 테이블의 컬럼을 나타내며 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 컬럼이 됨
 * 사용하는 이유는, 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용.
 * 문자열의 경우 VARCHAR(255)가 기본값인데, 사이즈를 500으로 늘리고 싶거나, 타입을 TEXT로 변경하고 싶거나 등의 경우에 사용됨.
 * <p>
 * 5. 기본 생성자 자동 추가
 * <p>
 * 6. 롬복: 클래스 내 모든 필드의 Getter 메소드 자동 생성
 * 롬복 어노테이션들은 코드 변경량을 최소화 시켜주기 때문에 적극적으로 사용 권장.
 * <p>
 * 7. 해당 클래스의 빌더 패턴 클래스를 생성
 * 생성자 상단에 선언 시, 생성자에 포함된 필드만 빌더에 포함.
 */

