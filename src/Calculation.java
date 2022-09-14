public class Calculation {
        public int calcResult(int num1, String operator, int num2){
                switch (operator){
                        case "+": return num1+num2;
                        case "-": return num1-num2;
                        case "*": return num1*num2;
                        case "/": return num1/num2;
                        default: throw new AssertionError();
                }
        }
}
