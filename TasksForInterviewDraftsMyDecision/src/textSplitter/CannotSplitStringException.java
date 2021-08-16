package textSplitter;

public class CannotSplitStringException extends  Exception {
    public CannotSplitStringException (String errorMessage){
        super(errorMessage);
    }

}
