package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BaseballNumbersTest {

    @Test
    void 랜덤_숫자_생성_테스트() {
        BaseballNumbers baseballNumbers = BaseballNumbers.generateRandom();
        int size = baseballNumbers.getNumbers().size();
        assertEquals(3, size);
    }

    @Test
    void 사용자_정상_입력_테스트() {
        BaseballNumbers numbers = BaseballNumbers.of("123");
        assertEquals(List.of(1, 2, 3), numbers.getNumbers());
    }
    @Test
    void 사용자_입력_예외_테스트() {
        assertThrows(IllegalArgumentException.class, () -> BaseballNumbers.of("113")); // 중복
        assertThrows(IllegalArgumentException.class, () -> BaseballNumbers.of("12")); // 잘못된 자리수 입력
        assertThrows(IllegalArgumentException.class, () -> BaseballNumbers.of("abc")); // 숫자가 아님
    }
}