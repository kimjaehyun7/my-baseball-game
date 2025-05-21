package baseball.domain;

public class BallCount {
    private final int strike;
    private final int ball;

    public BallCount(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public boolean isThreeStrike() {
        return strike == 3;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    @Override
    public String toString() {
        return null;
    }
}
