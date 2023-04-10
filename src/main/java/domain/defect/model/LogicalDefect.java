package domain.defect.model;

import domain.member.model.Member;

public final class LogicalDefect extends Defect {
    protected LogicalDefect(Member registrant, Member handler, String title, String description) {
        super(registrant, handler, title, description);
    }
}
