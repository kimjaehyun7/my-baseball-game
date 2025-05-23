package baseball.view;

import baseball.domain.BallCount;

public class OutputView {

    private static final String GAME_TITLE = "===============숫자야구 게임===============";
    private static final String GAME_RULE = "규칙 : 서로 다른 3자리 숫자를 입력해야 합니다.";
    private static final String ERROR_PREFIX = "[예외발생]";
    private static final String RETRY_MESSAGE = "숫자를 다시 입력하세요";

    public static void printStartMessage() {
        System.out.println(GAME_TITLE);
        System.out.println(GAME_RULE);
    }

    public static void printErrorMessage(String message) {
        System.out.println(ERROR_PREFIX + ": " + message);
        System.out.println("==" + RETRY_MESSAGE + "==");
    }

    public static void printResult(BallCount result) {
        System.out.println(result);
    }

    public static void endGame(int attempt) {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 시도 횟수:" + attempt + "회 [게임 종료]");
    }
}
