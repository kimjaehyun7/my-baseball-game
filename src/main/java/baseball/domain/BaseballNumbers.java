package baseball.domain;

import java.util.List;

public class BaseballNumbers {
    private final List<Integer> numbers;

    public BaseballNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public BaseballNumbers of(String input) {
        return null;
    }

    public static BaseballNumbers generateRandom() {
        return null;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
