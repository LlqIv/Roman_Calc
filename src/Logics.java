import java.util.Arrays;

public class Logics {
    private String operator;
    private int num1, num2;

    public String result(String calcLine) throws CalculationException{
        boolean flagRoman = false;
        Definition definition = new Definition();
        Calculation calculation = new Calculation();

        String[] calcValues = calcLine.split(" ");

        if(calcValues.length != 3)
            throw new CalculationException("Ошибка, выражение должно иметь вид |Число Операция Число|");

        if(definition.isOperator(calcValues[1])){
            operator = calcValues[1];
        } else
            throw new CalculationException("Не принадлежит одному из 4 операторов: + - * /");

        if(definition.isInt(calcValues[0]) && definition.isInt(calcValues[2])){
            num1 = Integer.parseInt(calcValues[0]);
            num2 = Integer.parseInt(calcValues[2]);
        } else if(definition.isRoman(calcValues[0]) && definition.isRoman(calcValues[2])){
            num1 = definition.romeToIntConvert(calcValues[0]);
            num2 = definition.romeToIntConvert(calcValues[2]);
            flagRoman = true;
        } else throw new CalculationException("Оба числа должны быть одного вида");

        int result = calculation.calcResult(num1, operator, num2);

        if(!(num1>=1 && num1<=10) || !(num2>=1 && num2<=10))
            throw new CalculationException("Числа должны быть от 1 до 10 или от I до X включительно");
        if(flagRoman){
            if(result < 0)
                throw new CalculationException("В римской системе нет отрицательных чисел(");
            return definition.intToRomeConvert(result);
        }

        return String.valueOf(result);
    }
}
