package baseball.view;

public class InputNumberView extends InputView {
    public String getNumber() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        System.out.printf("숫자를 입력해주세요 : ");
        String number = inputValue();
        return number;
    }
}
