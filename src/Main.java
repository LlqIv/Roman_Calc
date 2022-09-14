import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Калькулятор для выражений вида: |Число1 Операция Число2|, через пробел. Допускаются числа от 1 до 10 или от I до X включительно. Операции: + - * /");
            System.out.print("Введите выражение: ");
            String calcStr = sc.nextLine();
            Logics logics = new Logics();
            String result = logics.result(calcStr);
            System.out.println("Ответ: " + result);
        } catch (CalculationException e){}

    }
}