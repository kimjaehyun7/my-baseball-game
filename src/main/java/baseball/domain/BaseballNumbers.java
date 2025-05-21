package baseball.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseballNumbers {
    private final List<Integer> numbers;

    public BaseballNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static BaseballNumbers of(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("3자리수를 입력해야합니다.");
        }
        List<Integer> numbers = new ArrayList<>();
        Set<Integer> uniqueCheck = new HashSet<>(); // 중복 체크용 Set
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("숫자만 입력할 수 있습니다.");
            }
            int number = c - '0';
            if (!uniqueCheck.add(number)) {
                throw new IllegalArgumentException("중복된 숫자는 허용되지 않습니다.");
            }
            numbers.add(number);
        }
        return new BaseballNumbers(numbers);
    }

    public static BaseballNumbers generateRandom() {
        return null;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
