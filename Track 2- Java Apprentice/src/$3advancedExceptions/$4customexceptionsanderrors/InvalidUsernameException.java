package $3advancedExceptions.$4customexceptionsanderrors;

public class InvalidUsernameException extends RuntimeException {

    public InvalidUsernameException(String errorMessage) {
        super(errorMessage);
        this.initCause(new RuntimeException("The username must being with letter 'a'"));
    }

}
