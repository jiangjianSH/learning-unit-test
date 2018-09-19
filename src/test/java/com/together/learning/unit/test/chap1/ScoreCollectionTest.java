package com.together.learning.unit.test.chap1;

import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

class ScoreCollectionTest {
    public ScoreCollectionTest() {
        System.out.println("#######create######");
    }

    @Test
    void answerArithmeticMeanOfTwoNumbers() {
        ScoreCollection scoreCollection = new ScoreCollection();
        scoreCollection.add(() -> 5);
        scoreCollection.add(() -> 7);

        assertThat(6, is(scoreCollection.arithmeticMean()));
    }

    @Test
    void anotherTest() {

    }
}