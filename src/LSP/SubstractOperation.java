package LSP;

public class SubstractOperation extends AbstractOperation {
    public int operate (int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
//  ========================================================
        @Override
    public String getOperator() {
        return "-";
    }

}
