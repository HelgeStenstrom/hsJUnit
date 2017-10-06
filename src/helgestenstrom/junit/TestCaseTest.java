package helgestenstrom.junit;

// Done: Invoke test method
// Done: Invoke setUp first
// Done: Invoke tearDown afterward
// TODO: Invoke tearDown even if the test method fails
// TODO: Run multiple tests
// Done: Report collected results
// Done: Log string in WasRun
// TODO: Catch and report setUp errors

// Done: Check result by counts, not by summary.
// TODO: Count Faults and Errors separately.
// TODO: Test AssertThat
// TODO: AssertEqualStrings
// TODO: Only print stack trace when there is a problem.
// TODO: Run passing tests silently




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
        assertThat(1 == result.getRunCount());
        assertThat(0 == result.getFailureCount());
    }

    public void testFailedResultFormatting() {
        result.testStarted();
        result.testFailed();
        assertThat(1 == result.getRunCount());
        assertThat(1 == result.getFailureCount());
    }

    public void testFailedResult() {
        TestCase test = new WasRun("testBrokenMethod");
        test.run(result);
        assertThat(1 == result.getRunCount());
        assertThat(1 == result.getFailureCount());
    }

    public void testSuite() {
        TestSuite suite = new TestSuite();
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testBrokenMethod"));
        suite.run(result);
        assertThat(2 == result.getRunCount());
        assertThat(1 == result.getFailureCount());
    }

    public void testPassingSuite() {
        TestSuite suite = new TestSuite();
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testMethod"));
    //        TestResult result = suite.run();
        suite.run(result);
        assertThat(2 == result.getRunCount());
        assertThat(0 == result.getFailureCount());
    }

    public void testFormattingOfResults() {
        TestSuite suite = new TestSuite();
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testBrokenMethod"));
        suite.add(new WasRun("testBrokenMethod"));
        suite.run(result);
        assertThat("5 run, 2 failed".equals(result.summary()), "running one passing, one failing test.");
    }


}
