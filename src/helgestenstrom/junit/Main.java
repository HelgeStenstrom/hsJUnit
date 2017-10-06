package helgestenstrom.junit;



public class Main {

    public static void main(String[] args) {
        TestResult result = new TestResult();
        //System.out.println(allTests().run().summary());
        allTests().run(result);
        System.out.println(result.summary());
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
        suite.add(new TestCaseTest("testFormattingOfResults"));
        suite.add(new TestCaseTest("testPassingAssertion"));
        suite.add(new TestCaseTest("testFailingAssertion"));
        return suite;
    }
}
