package helgestenstrom.junit;

public class TestCaseTest extends TestCase {

    TestResult result;
    TestCaseTest(String name) {
        super(name);
    }

    public void setUp() {
        result = new TestResult();
    }

    public void testCanBeTestCase() {
        TestCase test = new WasRun("testMethod");
        assertThat(!test.wasRun);
        test.run(result);
        assertThat(test.wasRun);
    }

    public void classHasAName() {
        TestCase test = new WasRun("testMethod");
        assertThat("testMethod".equals(test.name));
    }

    public void callMethodByName() {
        TestCase test = new WasRun("testMethod");
        assertThat(!test.wasRun);
        test.run(result);
        assertThat(test.wasRun);
    }




    public void testTemplateMethod() {
        TestCase test = new WasRun("testMethod");
        test.run(result);
        assertThat("setUp testMethod tearDown ".equals(test.log), "Log of called methods.");
    }

    public void testResult() {
        TestCase test = new WasRun(("testMethod"));
        test.run(result);
        assertThat("1 run, 0 failed".equals(result.summary()));
    }

    public void testFailedResultFormatting() {
        result.testStarted();
        result.testFailed();
        assertThat("1 run, 1 failed".equals(result.summary()), "testFailedResultFormatting");
    }

    public void testFailedResult() {
        TestCase test = new WasRun("testBrokenMethod");
        test.run(result);
        assertThat("1 run, 1 failed".equals(result.summary()));
    }

    public void testSuite() {
        TestSuite suite = new TestSuite();
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testBrokenMethod"));
        suite.run(result);
        assertThat("2 run, 1 failed".equals(result.summary()), "running one passing, one failing test.");
    }

    public void testPassingSuite() {
        TestSuite suite = new TestSuite();
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testMethod"));
    //        TestResult result = suite.run();
        suite.run(result);
        assertThat("2 run, 0 failed".equals(result.summary()), "running two passing tests.");
    }

}
