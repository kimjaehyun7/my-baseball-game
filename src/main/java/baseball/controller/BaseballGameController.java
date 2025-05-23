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
            while (true) {
                try {
                    if (InputView.reStart().equals("2")) {
                        return;
                    }
                    break;
                } catch (IllegalArgumentException e) {
                    OutputView.printErrorMessage(e.getMessage());
                }
            }
        }
    }

    private static void game(BaseballNumbers randomNumbers) {
        int attempt = 0;
        Umpire umpire = new Umpire(randomNumbers);
        BallCount result;
        do {
            BaseballNumbers inputNumbers = BaseballNumbers.of(InputView.readInput());
            attempt++;
            result = umpire.compare(inputNumbers);
            OutputView.printResult(result);
        } while (!result.isThreeStrike());

        OutputView.endGame(attempt);
    }
}
