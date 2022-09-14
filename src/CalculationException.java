

public class CalculationException extends Exception{
    public CalculationException() {
        System.out.println("Неправильно задано выражение");
    }

    public CalculationException(String s){
        this();
        System.out.println(s);
    }
}
