package LSP;

//import OCP.AddOperation;
import OCP.Calculator;
import OCP.DivideOperation;
import OCP.MultiplyOperation;
import OCP.SubstractOperation;

public class Client {
    public static void main(String[] args) throws Exception {
//        Calculator calculator = new Calculator(); // 생성자를 통해 Calculator 호출

        int firNum = 140;
        int secNum = 60;
//
//        calculator.setOperation(new AddOperation());  // Calculator setOperation의  AbstaractOperation의 AddOperation의 정보를 담은 매개변수로 사용
//        int answer = calculator.calculate(firNum, secNum);
//        System.out.println(" answer = " + answer);
//
//        calculator.setOperation(new SubstractOperation());
//        answer = calculator.calculate(firNum, secNum);
//        System.out.println(" answer = " + answer);
//
//        calculator.setOperation(new MultiplyOperation());
//        answer = calculator.calculate(firNum, secNum);
//        System.out.println(" answer = " + answer);
//
//        calculator.setOperation(new DivideOperation());
//        answer = calculator.calculate(firNum, secNum);
//        System.out.println(" answer = " + answer);
// ======================================================================================================
        // 연산 결과만 출력
        DisplayTypeA displayTypeA = new DisplayTypeA();
        displayTypeA.displayResult(new AddOperation(), firNum, secNum);
        // displayTypeA.displayResultWithOperator(new AddOperation(), firNum, secNum); // Error 발생

        // 연산 과정까지 출력
        DisplayTypeB displayTypeB = new DisplayTypeB();
        displayTypeB.displayResultWithOperator(new AddOperation(), firNum, secNum);
        // displayTypeB.displayResult(new AddOperation(), firNum, secNum); // Error 발생
    }
}

