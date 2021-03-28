package view;

public class InputView {
    public static int number;
    public static String[] carName;

    public void InputCarName(String[] carName){
        this.carName = carName;
    }

    public void InputNumber(int number){
        try {
            this.number = number;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("[ERROR] 숫자가 아닌 문자를 입력하셨습니다.\n");
        }
    }
}
