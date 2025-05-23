package baseball.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);
    public static String readInput() {
        System.out.print("숫자를 입력해주세요: ");
        return scanner.nextLine();
    }

    public static String reStart() {
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요: ");
        String input = scanner.nextLine();
        reStartValidate(input);
        return input;
    }

    private static void reStartValidate(String input) {
        if (!input.equals("1") && !input.equals("2")) {
            throw new IllegalArgumentException("1 또는 2만 입력할 수 있습니다.");
        }
    }
}
