package com.danyuan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class appUnitTest2 {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(true, AppUtil.testData2());
    }
}