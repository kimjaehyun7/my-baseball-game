package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseballNumbersTest {

    @Test
    void 랜덤_숫자_생성_테스트() {
        BaseballNumbers baseballNumbers = BaseballNumbers.generateRandom();
        int size = baseballNumbers.getNumbers().size();
        assertEquals(3, size);
    }
}