package domain.defect.model;

import domain.defect.business.enums.DefectTypeEnum;
import domain.member.model.Member;
import lombok.Getter;

@Getter
public final class DataDefect extends Defect {

    private String type;

    protected DataDefect(Member registrant, Member handler, String title, String description) {

        super(registrant, handler, title, description);
        this.type = DefectTypeEnum.DATA.getValue();

    }
}
