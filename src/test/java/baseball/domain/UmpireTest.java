package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UmpireTest {

    Umpire umpire;

    @BeforeEach
    void setUp() {
        BaseballNumbers answer = new BaseballNumbers(List.of(1, 2, 3));
        umpire = new Umpire(answer);
    }

    @Test
    void 스트라이크() {
        BaseballNumbers guess = new BaseballNumbers(List.of(1, 4, 5));
        BallCount compare = umpire.compare(guess);
        assertEquals(1, compare.getStrike());
    }

    @Test
    void 볼() {
        BaseballNumbers guess = new BaseballNumbers(List.of(2, 3, 1));
        BallCount compare = umpire.compare(guess);
        assertEquals(3, compare.getBall());
    }

    @Test
    void 낫싱() {
        BaseballNumbers guess = new BaseballNumbers(List.of(4,5,6));
        BallCount compare = umpire.compare(guess);
        assertEquals(0, compare.getStrike());
        assertEquals(0, compare.getBall());
    }

    @Test
    void 스트라이크_볼() {
        BaseballNumbers guess = new BaseballNumbers(List.of(1,3,2));
        BallCount compare = umpire.compare(guess);
        assertEquals(1, compare.getStrike());
        assertEquals(2, compare.getBall());
    }
}