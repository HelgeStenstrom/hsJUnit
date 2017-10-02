package helgestenstrom.junit;

// Done: Invoke test method
// Done: Invoke setUp first
// Done: Invoke tearDown afterward
// TODO: Invoke tearDown even if the test method fails
// TODO: Run multiple tests
// Done: Report collected results
// Done: Log string in WasRun
// TODO: Catch and report setUp errors


public class Main {

    public static void main(String[] args) {
        System.out.println(new TestCaseTest("testCanBeTestCase").run().summary());
        System.out.println(new TestCaseTest("classHasAName").run().summary());
        System.out.println(new TestCaseTest("callMethodByName").run().summary());
        System.out.println(new TestCaseTest("testTemplateMethod").run().summary());
        System.out.println(new TestCaseTest("testResult").run().summary());
        System.out.println(new TestCaseTest("testFailedResultFormatting").run().summary());
        System.out.println(new TestCaseTest("testFailedResult").run().summary());
        // new TestCaseTest("testSuite").run();
        System.out.println(new TestCaseTest("testSuite").run().summary());
        // new TestCaseTest("testThatTearDownIsRunEvenIfMethodFails").run();

        TestResult result = new TestResult();
        result = new TestCaseTest("testCanBeTestCase").run(result);
        result = new TestCaseTest("classHasAName").run(result);
        result = new TestCaseTest("callMethodByName").run(result);
        result = new TestCaseTest("testTemplateMethod").run(result);
        System.out.printf("run: result = %s \n", result.summary());
    }

}
