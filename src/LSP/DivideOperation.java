package LSP;

public class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public boolean isInvalid(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return true;
        }else {
            return false;
        }// 나누기만 가진 고유의 특성이기에 조건을 사용하여 리턴값을 반환
    }
}