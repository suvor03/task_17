package ru.vsu.cs.suvorov_d_a;

import org.junit.Test;
import org.junit.Assert;

public class TestOfSorting {
    @Test
    public void testingArrayWithAllFalse() {
        int[] testingInputArray = {5, 4, 3, 2, 1};
        Boolean[] fixed = {false, false, false, false, false};
        int[] actualArray = MyBubbleSorting.sort(testingInputArray, fixed);
        int[] correctOutputArray = {5, 4, 3, 2, 1};

        Assert.assertArrayEquals(correctOutputArray, actualArray);
    }

    @Test
    public void testingArrayWithAllTrue() {
        int[] testingInputArray = {5, 4, 3, 2, 1};
        Boolean[] fixed = {true, true, true, true, true};
        int[] actualArray = MyBubbleSorting.sort(testingInputArray, fixed);
        int[] correctOutputArray = {1, 2, 3, 4, 5};

        Assert.assertArrayEquals(correctOutputArray, actualArray);
    }

    @Test
    public void testingArrayWithTrueAndFalse() {
        int[] testingInputArray = {5, 4, 3, 2, 1};
        Boolean[] fixed = {false, true, false, true, true};
        int[] actualArray = MyBubbleSorting.sort(testingInputArray, fixed);
        int[] correctOutputArray = {5, 1, 3, 2, 4};

        Assert.assertArrayEquals(correctOutputArray, actualArray);
    }

    @Test
    public void testingArrayWithAllZeroes() {
        int[] testingInputArray = {0, 0, 0};
        Boolean[] fixed = {true, true, true};
        int[] actualArray = MyBubbleSorting.sort(testingInputArray, fixed);
        int[] correctOutputArray = {0, 0, 0};

        Assert.assertArrayEquals(correctOutputArray, actualArray);
    }

    @Test
    public void testingArrayWithTwoElements() {
        int[] testingInputArray = {5, 4};
        Boolean[] fixed = {true, true};
        int[] actualArray = MyBubbleSorting.sort(testingInputArray, fixed);
        int[] correctOutputArray = {4, 5};

        Assert.assertArrayEquals(correctOutputArray, actualArray);
    }
}
