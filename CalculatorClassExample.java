import java.util.Scanner;

/**
 * CalculatorClassExample
 * 예제 5-5
 * 숫자 2개 계산기
 */


 /*div() 메서드 예외처리 안했음 */
class Calculator {
    double firstNum;
    double secondNum;

    Calculator(double firstNum, double secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    double add(){
        return this.firstNum+this.secondNum;
    }
    double sub(){
        return this.firstNum+this.secondNum;
    }
    double mul(){
        return this.firstNum*this.secondNum;
    }
    double div(){
        return this.firstNum/this.secondNum;
    }
}
public class CalculatorClassExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result;
        double firstNum = sc.nextDouble();
        char operator = sc.next().charAt(0);
        double secondNum = sc.nextDouble();

        Calculator calculator = new Calculator(firstNum, secondNum);
        switch (operator) {
            case '+':
                result = calculator.add();
                System.out.println("더하기 결과: " + result);
                break;
            case '-':
                result = calculator.sub();
                System.out.println("빼기 결과: " + result);
                break;
            case '*':
                result = calculator.mul();
                System.out.println("곱하기 결과: " + result);
                break;
            case '/':
                try {
                    result = calculator.div();
                    System.out.println("나누기 결과: " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("올바른 연산자가 아닙니다.");
        }
        sc.close();
    }
}