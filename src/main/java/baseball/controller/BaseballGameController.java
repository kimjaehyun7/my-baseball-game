package baseball.controller;

import baseball.domain.BallCount;
import baseball.domain.BaseballNumbers;
import baseball.domain.Umpire;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGameController {

    public void run() {

        while (true) {
            System.out.println("===============숫자야구 게임===============");
            System.out.println("규칙 : 서로 다른 3자리 숫자를 입력해야 합니다.");
            BaseballNumbers randomNumbers = BaseballNumbers.generateRandom();

            boolean success = false;
            while (!success) {
                try {
                    game(randomNumbers);
                    success = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("[예외발생] " + e.getMessage());
                    System.out.println("숫자를 다시 입력하세요.");
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
