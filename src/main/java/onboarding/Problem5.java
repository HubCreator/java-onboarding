package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    private static List<Integer> entry = Arrays.asList(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1);

    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();
        initAnswer(answer);
        getAnswer(money, answer);
        return answer;
    }

    private static void initAnswer(List<Integer> answer) {
        for (int i = 0; i < entry.size(); i++) {
            answer.add(0);
        }
    }

    private static int makeResult(int money, List<Integer> answer, int idx) {
        Integer targetBill = entry.get(idx);
        int operateResult = money / targetBill;

        if (operateResult > 0) {
            answer.set(idx, answer.get(idx) + operateResult);
            return money - (targetBill * operateResult);
        }
        return money;
    }

    private static void getAnswer(int money, List<Integer> answer) {
        int idx = 0;
        while (money > 0) {
            money = makeResult(money, answer, idx++);
        }
    }
}
