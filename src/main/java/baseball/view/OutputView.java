package baseball.view;

import baseball.domain.BallCount;

public class OutputView {

    public static void printResult(BallCount result) {
        System.out.println(result);
    }

    public static void endGame() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
