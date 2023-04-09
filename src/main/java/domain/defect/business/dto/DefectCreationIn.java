package domain.defect.business.dto;

import domain.member.model.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DefectCreationIn {

    private Member registrant;
    private Member handler;
    private String title;
    private String description;

}
