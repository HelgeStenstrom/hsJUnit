package helgestenstrom.junit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        testThatRunInWasRunMarksThatItWasRun();
        testCanBeTestCase();
        classHasAName();
        callMethodByName();
        findMethodsThatAreTests();
    }

    private static void testThatRunInWasRunMarksThatItWasRun() {
        WasRun test = new WasRun("testMethod");
        assert test.wasRun == false;
        test.run();
        myAssert(test.wasRun);
    }

    private static void testCanBeTestCase() {
        TestCase test = new WasRun("testMethod");
        assert test.wasRunParent = false;
        test.run();
        myAssert(test.wasRunParent);
    }

    private static void classHasAName() {
        TestCase test = new WasRun("testMethod");
        myAssert("testMethod".equals(test.nameInBaseClass));
    }

    private static void callMethodByName() {
        TestCase test = new WasRun("testMethod");
        assert test.wasRunParent = false;
        test.runByName();
        myAssert(test.wasRunParent);
        System.out.print(".");
    }

    private static void findMethodsThatAreTests() {
        TestCase test = new WasRun("testMethod");

        // TODO: lista över namn, ska jämföras med list från testFinder


    }

    private static void myAssert(boolean b) {
        if (!b) {
            throw new AssertionError("Not true ");
        }
    }
}
