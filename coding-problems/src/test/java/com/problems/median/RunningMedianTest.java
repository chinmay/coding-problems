package com.problems.median;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by chinmay on 5/4/2017.
 */
public class RunningMedianTest {

    @Test
    public void testMedian() {
        RunningMedian client = new RunningMedian();

        client.add(2);
        client.add(3);
        client.add(4);

        assertNotNull(client.findMedian());
        //assertEquals(3 , client.findMedian());
    }
}
