package helgestenstrom.junit;

public class TestCaseTest extends TestCase {


    TestCaseTest(String name) {
        super(name);
    }

    public void setUp() {
    }

    public void testTemplateMethod() {
        TestCase test = new WasRun("testMethod");
        test.run();
        assertThat("setUp testMethod ".equals(test.log));
    }
}
