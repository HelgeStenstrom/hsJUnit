package helgestenstrom.junit;

public class TestCaseTest extends TestCase {


    TestCaseTest(String name) {
        super(name);
    }

    public void setUp() {
    }

    public void testCanBeTestCase() {
        TestCase test = new WasRun("testMethod");
        assertThat(!test.wasRun);
        test.run();
        assertThat(test.wasRun);
    }

    public void classHasAName() {
        TestCase test = new WasRun("testMethod");
        assertThat("testMethod".equals(test.name));
    }

    public void callMethodByName() {
        TestCase test = new WasRun("testMethod");
        assertThat(!test.wasRun);
        test.run();
        assertThat(test.wasRun);
        System.out.print(".");
    }




    public void testTemplateMethod() {
        TestCase test = new WasRun("testMethod");
        test.run();
        assertThat("setUp testMethod tearDown ".equals(test.log), "Log of called methods.");
    }

    public void testResult() {
        TestCase test = new WasRun(("testMethod"));
        TestResult result = test.run();
        assertThat("1 run, 0 failed".equals(result.summary()));
    }

    public void testFailedResult() {
        TestCase test = new WasRun("testBrokenMethod");
        TestResult result = test.run();
        // TODO: an exception is thrown. Handle it! read page 107.
        assertThat("1 run, 1 failed".equals(result.summary()));
    }

    public void testFailedResultFormatting() {
        TestResult result = new TestResult();
        result.testStarted();
        result.testFailed();
        assertThat("1 run, 1 failed".equals(result.summary()), "testFailedResultFormatting");
    }
}
