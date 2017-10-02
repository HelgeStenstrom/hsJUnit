package helgestenstrom.junit;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

// Done: Invoke test method
// Done: Invoke setUp first
// Done: Invoke tearDown afterward
// TODO: Invoke tearDown even if the test method fails
// TODO: Run multiple tests
// TODO: Report collected results
// Done: Log string in WasRun


public class Main {

    public static void main(String[] args) {
        new TestCaseTest("testCanBeTestCase").run();
        new TestCaseTest("classHasAName").run();
        new TestCaseTest("callMethodByName").run();

        new TestCaseTest("testTemplateMethod").run();
        new TestCaseTest("testResult").run();
        //new TestCaseTest("testFailedResult").run();
        new TestCaseTest("testFailedResultFormatting").run();
        // new TestCaseTest("testThatTearDownIsRunEvenIfMethodFails").run();
    }

}
