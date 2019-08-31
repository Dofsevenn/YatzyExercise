package com.KjetilBjelldokken.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    @Test
    void shouldCalculatTwos() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void shouldCalculateOnes() {
        assertEquals(1, score(Category.ONES, new int[]{2, 1, 4, 5, 6}));
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
            System.out.println(count);
        }

        /*
      for(int value : rolls) {
          count += value;
      } */
      return count;
    }

}