package helgestenstrom.junit;

public class TestResult {

    public int getRunCount() {
        return runCount;
    }

    public int getFailureCount() {
        return failureCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    private int runCount = 0;
    private int failureCount = 0;
    private int errorCount = 0;

    void testStarted() {
        runCount += 1;
    }

    void testFailed() {
        failureCount += 1;
    }

    void testErrored() {
        errorCount += 1;
    }


    String summary() {
        return String.format("%d run, %d failed", runCount, failureCount);
    }
}
