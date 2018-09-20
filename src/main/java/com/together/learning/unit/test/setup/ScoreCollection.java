package com.together.learning.unit.test.setup;

import java.util.*;

/**
 * @author jiangjian
 */
public class ScoreCollection {
    private List<Scoreable> scores = new ArrayList<>();

    public void add(Scoreable scoreable) {
        scores.add(scoreable);
    }
    public int arithmeticMean() {
        int total = scores.stream().mapToInt(Scoreable::getScore).sum();
        System.out.println(total);
        return total / scores.size();
    }
}