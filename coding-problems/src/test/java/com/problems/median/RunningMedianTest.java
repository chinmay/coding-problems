package com.problems.median;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by chinmay on 5/4/2017.
 */
public class RunningMedianTest {

    @Test
    public void testOddNumbers() {
        RunningMedian client = new RunningMedian();

        client.add(2);
        client.add(3);
        client.add(5);

        assertEquals(3.0, client.findMedian());
    }

    @Test
    public void testEvenNumbers() {
        RunningMedian client = new RunningMedian();

        client.add(2);
        client.add(3);
        client.add(4);
        client.add(5);

        assertEquals(3.5, client.findMedian());
    }
}
