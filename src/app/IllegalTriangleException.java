package app;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException (){
        super("Triangle is not valid.");
    }
    public IllegalTriangleException (String string){
        super(string);
    }
}
