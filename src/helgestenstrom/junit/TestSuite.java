package helgestenstrom.junit;

import java.util.ArrayList;

public class TestSuite {

    ArrayList<TestCase> tests = new ArrayList<TestCase>();

    public void add(TestCase test) {
        tests.add(test);
    }

    public TestResult run() {
        TestResult result = new TestResult();
        for (TestCase test: tests) {
            test.run(result);
        }
        return result;
    }
}
