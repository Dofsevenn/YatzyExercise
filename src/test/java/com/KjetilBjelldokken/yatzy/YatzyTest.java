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

    @Test
    void shouldCalculateForThrees() {
        assertEquals(0, score(Category.THREES, new int[]{1, 2, 4, 5, 6}));
        assertEquals(3, score(Category.THREES, new int[]{2, 3, 3, 3, 1}));
        assertEquals(5, score(Category.THREES, new int[]{3, 3, 3, 3, 3}));
    }

    @Test
    void shouldCalculateForFours() {
        assertEquals(0, score(Category.FOURS, new int[]{1, 2, 3, 5, 6}));
        assertEquals(3, score(Category.FOURS, new int[]{2, 4, 3, 4, 4}));
        assertEquals(5, score(Category.FOURS, new int[]{4, 4, 4, 4, 4}));
    }

    enum Category {
        ONES, TWOS, THREES, FOURS
    }

    static int score(Category category, int[] rolls) {
        int count = 0;
        if(category == (Category.ONES)) {
            for (int i = 4; i >= 0; i--) {
                if (rolls[i] == 1) {
                    count += rolls[i];
                }
            }
            System.out.println(count + " ones");

        } else if(category == (Category.TWOS)) {
            for (int i = 4; i >= 0; i--) {
                if (rolls[i] == 2) {
                    count += rolls[i] / 2;
                }
            }
            System.out.println(count + " twos");

        } else if(category == (Category.THREES)) {
            for (int i = 4; i >= 0; i--) {
                if (rolls[i] == 3) {
                    count += rolls[i] / 3;
                }
            }
            System.out.println(count + " threes");

        } else if(category == (Category.FOURS)) {
            for (int i = 4; i >= 0; i--) {
                if (rolls[i] == 4) {
                    count += rolls[i] / 4;
                }
            }
            System.out.println(count + " fours");
        }
        return count;
    }
}