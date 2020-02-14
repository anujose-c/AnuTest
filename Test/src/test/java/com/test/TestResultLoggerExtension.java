package com.test;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

public class TestResultLoggerExtension implements TestWatcher {
    private static int failCount = 0;

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        ++failCount;
    }

    public int getFailCount() {
        return failCount;
    }
}