package com.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(TestResultLoggerExtension.class)
public class Flakes {

    private static int runCount = 0;

    @Test
    public void run() {
        runCount++;
        System.out.println("run: " + runCount);
        assertTrue(runCount >= 3);
    }

    @AfterAll
    public static  void cleanup() {
        final int failCount = new TestResultLoggerExtension().getFailCount();
        if (failCount == 0) {
            System.out.println("ALL TESTS PASSED");
        }
    }

}