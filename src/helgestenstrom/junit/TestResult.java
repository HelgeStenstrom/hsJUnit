package helgestenstrom.junit;

public class TestResult {

    int runCount = 0;
    int errorCount = 0;

    void testStarted() {
        runCount += 1;
    }

    void testFailed() {
        errorCount += 1;
    }

    String summary() {
        return String.format("%d run, %d failed", runCount, errorCount);
    }
}
