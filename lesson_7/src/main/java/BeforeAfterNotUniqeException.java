public class BeforeAfterNotUniqeException extends RuntimeException{
    public BeforeAfterNotUniqeException(String type){
        super(type + " - not unique");
    }
}
