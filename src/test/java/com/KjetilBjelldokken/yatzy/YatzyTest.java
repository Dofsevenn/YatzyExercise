package com.KjetilBjelldokken.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    @Test
    void shouldCalculatTwos() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void shouldCalculateForOnes() {
        assertEquals(0, score(Category.ONES, new int[]{2, 3, 4, 5, 6}));
        assertEquals(3, score(Category.ONES, new int[]{2, 1, 4, 1, 1}));
        assertEquals(5, score(Category.ONES, new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    void shouldCalculateForTwoa() {
        assertEquals(0, score(Category.TWOS, new int[]{1, 3, 4, 5, 6}));
        assertEquals(3, score(Category.TWOS, new int[]{2, 1, 2, 2, 1}));
        assertEquals(5, score(Category.TWOS, new int[]{2, 2, 2, 2, 2}));
    }

    enum Category {
        ONES, TWOS, THREES
    }

    static int score(Category category, int[] rolls) {
        int count = 0;

        for(int i = 4; i >= 0; i--) {
            if(rolls[i] == 1) {
                count += rolls[i];
            }
        }
        System.out.println(count + " ones");
        return count;
    }
}