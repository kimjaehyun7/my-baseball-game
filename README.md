# 숫자 야구 게임 (연습)

> 컴퓨터가 랜덤으로 생성한 3자리수를 스트라이크, 볼 정보를 통해 맞히는 게임.

---
## 게임 규칙
1. 1~9까지의 서로 다른 숫자 3자리 입력
2. 컴퓨터가 만든 숫자와 자리/값을 비교
3. 자리와 값이 모두 같으면 `스트라이크`
4. 값은 같지만 자리가 다르면 `볼`
5. `3 스트라이크` 일 경우 게임 종료 
6. 종료 후 `1(재시작)` 또는 `2(종료)` 선택

---

# 프로젝트 구조
```
src/
├── main/
│   └── java/
│       └── baseball/
│           ├── App.java
│           ├── controller/
│           │   └── BaseballGameController.java 
│           ├── domain/ 
│           │   ├── BallCount.java 
│           │   ├── BaseballNumbers.java
│           │   └── Umpire.java
│           └── view/ 
│               ├── InputView.java
│               └── OutputView.java
└── test/
    └── java/
        └── baseball/
            └── domain/
                ├── BaseballNumbersTest.java
                └── UmpireTest.java
```