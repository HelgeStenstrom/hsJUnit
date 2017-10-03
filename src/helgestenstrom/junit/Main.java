package helgestenstrom.junit;

// Done: Invoke test method
// Done: Invoke setUp first
// Done: Invoke tearDown afterward
// TODO: Invoke tearDown even if the test method fails
// TODO: Run multiple tests
// Done: Report collected results
// Done: Log string in WasRun
// TODO: Catch and report setUp errors

// TODO: Only print stack trace when there is a problem.
// TODO: Run passing tests silently


public class Main {

    public static void main(String[] args) {
        System.out.println(allTests().run().summary());
    }

    static TestSuite allTests() {
        TestSuite suite = new TestSuite();
        suite.add(new TestCaseTest("testCanBeTestCase"));
        suite.add(new TestCaseTest("classHasAName"));
        suite.add(new TestCaseTest("callMethodByName"));
        suite.add(new TestCaseTest("testTemplateMethod"));
        suite.add(new TestCaseTest("testResult"));
        suite.add(new TestCaseTest("testFailedResultFormatting"));
        suite.add(new TestCaseTest("testFailedResult"));
        suite.add(new TestCaseTest("testSuite"));
        suite.add(new TestCaseTest("testPassingSuite"));
        return suite;
    }
}
