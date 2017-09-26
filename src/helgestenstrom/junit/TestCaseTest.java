package helgestenstrom.junit;

public class TestCaseTest extends TestCase {


    public TestCaseTest(String name) {
        super(name);
    }

    public void testRunning() {
        TestCase test = new WasRun("testMethod");
        assertThat(!test.wasRun);
        test.run();
        assertThat(test.wasRun);
    }
}
