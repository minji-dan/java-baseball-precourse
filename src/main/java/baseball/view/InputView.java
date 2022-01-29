package baseball.view;

import baseball.Numbers;
import baseball.PlayButton;
import utils.NumbersFactory;

public class InputView {
    private static final String INPUT_MSG="숫자를 입력해주세요";
    private static final String RESTART_MSG="게임 새로 시작할려면 1, 종료할려면 2";

    private InputView() {}

    public static Numbers getNumbers(Scanner scanner) {

        OutputView.printMsg(INPUT_MSG);

    }

    public static PlayButton getPlayAgainButton(Scanner scanner) {
        OutputView.printMsg(RESTART_MSG);
    }

    private static String getInput(Scanner scanner){
        return scanner.nextLine();
    }

}
