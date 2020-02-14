package com.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TestResultLoggerExtension.class)
public class Pass {
    @AfterAll
    public static void cleanup() {
        final int failCount = new TestResultLoggerExtension().getFailCount();
        if (failCount == 0) {
            System.out.println("ALL TESTS PASSED");
        }
    }

    @Test
    public void testPass() {
        Assertions.assertEquals(1, 1);
    }
}
