package baseball.domain;

import java.util.List;

public class Umpire {
    private final BaseballNumbers answer;

    public Umpire(BaseballNumbers answer) {
        this.answer = answer;
    }

    public BallCount compare(BaseballNumbers guess) {
        int strike = countStrike(guess);
        int ball = countBall(guess);
        return new BallCount(strike, ball);
    }

    private int countStrike(BaseballNumbers guess) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (answer.getNumbers().get(i).equals(guess.getNumbers().get(i))) {
                count++;
            }
        }
        return count;
    }

    private int countBall(BaseballNumbers guess) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (answer.getNumbers().contains(guess.getNumbers().get(i)) &&
                    !answer.getNumbers().get(i).equals(guess.getNumbers().get(i))) {
                count++;
            }
        }
        return count;
    }
}
