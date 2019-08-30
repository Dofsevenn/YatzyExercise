package com.KjetilBjelldokken.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    @Test
    void shouldCalculatTwos (){
        assertEquals(4, 2+2);
    }

    @Test
    void shouldCalculateForOnes() {
        assertEquals(0, score(ONES, new int[]{2, 3, 4, 5, 6}));
        assertEquals(0, score(ONES, new int[]{2, 1, 4, 1, 1}));
        assertEquals(0, score(ONES, new int[]{1, 1, 1, 1, 1}));
    }



}
