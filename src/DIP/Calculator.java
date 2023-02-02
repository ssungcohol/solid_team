package DIP;

public class Calculator {
    private AbstractOperation operation;   // 캡슐화

    public void setOperation (AbstractOperation operation) { // 세터 사용   ,  메서드
        this.operation = operation;
    }
    public int calculate(int firstNumber, int secondNumber) {   //메서드
        return  operation.operate(firstNumber, secondNumber);
    }

}