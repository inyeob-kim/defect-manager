package domain.defect.model;

import domain.defect.business.enums.DefectStatusEnum;
import domain.member.model.Member;
import lombok.Getter;
import lombok.Setter;

//결함 종류
//UI결함("UI 결함"),
//LOGIC결함("Logic 결함"),
//표준미준수("표준 미준수"),
//대내인터페이스결함("대내 인터페이스 결함"),
//대외인터페이스결함("대외 인터페이스 결함"),
//데이터결함("데이터 결함"),
//형상결함("형상 결함"),
//환경결함("환경 결함"),
//기타("기타"),
//CR변경요청사항("CR (변경요청사항)");
@Getter
@Setter
public abstract class Defect {

    protected Long id;
    protected String title;
    protected String description;
    protected String priority;
    protected String severity;
    protected String status;
    protected Member registrant;
    protected Member handler;


    protected Defect(Member registrant, Member handler, String title, String description) {

        this.registrant = registrant;
        this.handler = handler;
        this.title = title;
        this.description = description;
        this.status = DefectStatusEnum.REGISTERED.getValue();
    }

    /**
     * 결함 상태 변경
     * @param status
     */
    public void changeStatus(String status){
        this.status = status;
    }

}
