package com.together.learning.unit.test.hamcrest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jiangjian
 */
public class MatchersTest {
    @Test
    void arrayTest() {
       // assertThat(new String[] {"a", "b", "d"}, equalTo(new String[] {"a", "b"}));
    }

    @Test
    void notTest() {
        assertThat("a", not("b"));
    }

    @Test
    void floatNumberTest() {
        //assertThat(2.32 * 3, equalTo(6.96));
        assertTrue(Math.abs((2.32 * 3) - 6.96) < 0.0005);
    }

    static class InnerTest {
        @Test
        void innerTest() {
            System.out.println("############inner test");
        }
    }

    @Test
    void arrayEquals() {
        String[] actual = new String[]{"a", "b", "c"};
        String[] expected = new String[]{"a", "b"};
        assertThat(actual, arrayWithSize(3));
        assertThat(Arrays.asList(actual), hasItems("a", "b"));
    }
}
