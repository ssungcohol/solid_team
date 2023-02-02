package LSP;

abstract class AbstractOperation {
    public abstract int operate (int firstNumber, int secondNumber); //추상메서드 ; abstract

//    =======================================================
    public abstract String getOperator();
}// 추상 클래스는 선언부만 불러도 호출 가능
