package helgestenstrom.junit;

public class TestCaseTest extends TestCase {

    TestCase test;

    TestCaseTest(String name) {
        super(name);
    }

    public void setUp() {
        test = new WasRun("testMethod");
    }

    public void testRunning() {
        assertThat(!test.wasRun);
        test.run();
        assertThat(test.wasRun);
    }

    public void testSetUp() {
        assertThat((!test.wasSetup));
        test.run();
        assertThat(test.wasSetup);
    }
}
