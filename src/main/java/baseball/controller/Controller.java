package baseball.controller;

import baseball.view.InputNumberView;

public class Controller {
    public void run() {
        InputNumberView inputNumberView = new InputNumberView();
        System.out.println(inputNumberView.getNumber());
    }
}
