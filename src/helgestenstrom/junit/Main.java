package helgestenstrom.junit;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

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
    }

}
