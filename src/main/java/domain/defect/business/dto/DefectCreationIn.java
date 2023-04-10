package domain.defect.business.dto;

import domain.member.model.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DefectCreationIn {

    private String title;
    private String description;
    private String priority;
    private String severity;
    private String status;
    private Member registrant;
    private Member handler;

}
