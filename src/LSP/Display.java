package LSP;

public interface Display { // 인터페이스는 추상메서드와 상수만 사용가능
    public abstract void displayResult(AbstractOperation operation, int firstNumber, int secondNumber) throws Exception;
    public abstract void displayResultWithOperator(AbstractOperation operation, int firstNumber, int secondNumber) throws Exception;
}
