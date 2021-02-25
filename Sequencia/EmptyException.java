public class EmptyException extends Exception{
    private String e;

    public EmptyException(String err){
        super(err);
        e = err;
    }

    public String getError(){
      return e;
    }
}