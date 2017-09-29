package helgestenstrom.junit;

public class TestResult {

    int runCount = 1;

    String summary() {
        return String.format("%d run, 0 failed", runCount);
    }
}
