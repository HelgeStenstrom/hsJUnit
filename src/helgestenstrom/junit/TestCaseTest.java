package helgestenstrom.junit;

public class TestCaseTest extends TestCase {


    TestCaseTest(String name) {
        super(name);
    }

    public void testRunning() {
        TestCase test = new WasRun("testMethod");
        assertThat(!test.wasRun);
        test.run();
        assertThat(test.wasRun);
    }

    public static void testSetUp() {
        TestCase test = new WasRun("testMethod");
        assertThat((!test.wasSetup));
        test.run();
        assertThat(test.wasSetup);
    }
}
