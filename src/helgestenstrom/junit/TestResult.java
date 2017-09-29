package helgestenstrom.junit;

public class TestResult {

    int runCount = 0;

    void testStarted() {
        runCount += 1;
    }

    String summary() {
        return String.format("%d run, 0 failed", runCount);
    }
}
