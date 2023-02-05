package LSP;

public abstract class AbstractOperation {
    public abstract int operate(int firstNumber, int secondNumber);
    public boolean isInvalid(int firstNumber, int secondNumber) {
        return false; // 나누기를 제외한 다른 애들은 inInvalid 메서드를 받으면 false를 반환해주면 된다.
    }
}
// 추상 클래스는 선언부만 불러도 호출 가능
