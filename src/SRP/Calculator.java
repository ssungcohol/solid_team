package SRP;

public class Calculator {
    private AddOperation addOperation; // 캡슐화 인스턴스 변수
    private SubstractOperation substractOperation; //
    private MultiplyOperation multiplyOperation;
    private DivideOperation divideOperation;

    public Calculator(AddOperation addOperation, SubstractOperation substractOperation,         //매개변수 가져오기  생성자
                           MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;            // 지역변수에 값 넣기
        this.substractOperation = substractOperation;
        this.multiplyOperation =  multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public int calculate(String operator, int firstNumber, int secondNumber) {    //메서드 선언, 매개변수가져오기
        int answer = 0;       //

        if(operator.equals("+")){
            answer = addOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("-")){
            answer = substractOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("*")){
            answer = multiplyOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("/")){
            answer = divideOperation.operate(firstNumber, secondNumber);
        }
        return answer;
    }
}