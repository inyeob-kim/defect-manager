package domain.defect.business.exceptions;

public class InvalidDefectCreationException extends RuntimeException {

    public InvalidDefectCreationException(String msg) {
        super(msg);
    }

}
