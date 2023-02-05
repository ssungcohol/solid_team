package DIP;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        int firNum = 140;
        int secNum = 60;

        calculator.setOperation(new AddOperation());  // Calculator setOperation의  AbstaractOperation의 AddOperation의 정보를 담은 매개변수로 사용
        int answer = calculator.calculate(firNum, secNum);
        System.out.println(" answer = " + answer);

        calculator.setOperation(new SubstractOperation());
        answer = calculator.calculate(firNum, secNum);
        System.out.println(" answer = " + answer);

        calculator.setOperation(new MultiplyOperation());
        answer = calculator.calculate(firNum, secNum);
        System.out.println(" answer = " + answer);

        calculator.setOperation(new DivideOperation());
        answer = calculator.calculate(firNum, secNum);
        System.out.println(" answer = " + answer);
    }
}

