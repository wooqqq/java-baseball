package baseball.controller;

import baseball.model.Number;
import baseball.view.InputNumberView;

public class Controller {
    public void run() {
        Number number = getNumber();

    }

    private Number getNumber() {
        InputNumberView inputNumberView = new InputNumberView();
        String input = inputNumberView.getNumber();
        int number = Integer.parseInt(input);
        return new Number(number);
    }
}
