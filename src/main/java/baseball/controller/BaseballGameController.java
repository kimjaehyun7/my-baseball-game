package baseball.controller;

import baseball.domain.BallCount;
import baseball.domain.BaseballNumbers;
import baseball.domain.Umpire;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGameController {

    public void run() {

        while (true) {
            OutputView.printStartMessage();
            BaseballNumbers randomNumbers = BaseballNumbers.generateRandom();

            boolean success = false;
            while (!success) {
                try {
                    game(randomNumbers);
                    success = true;
                } catch (IllegalArgumentException e) {
                    OutputView.printErrorMessage(e.getMessage());
                }
            }
            if (InputView.reStart().equals("2")) {
                break;
            }
        }
    }

    private static void game(BaseballNumbers randomNumbers) {
        Umpire umpire = new Umpire(randomNumbers);
        BallCount result;
        do {
            BaseballNumbers inputNumbers = BaseballNumbers.of(InputView.readInput());
            result = umpire.compare(inputNumbers);
            OutputView.printResult(result);
        } while (!result.isThreeStrike());

        OutputView.endGame();
    }
}
