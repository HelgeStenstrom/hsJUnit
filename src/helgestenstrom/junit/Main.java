package helgestenstrom.junit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        testThatRunInWasRunMarksThatItWasRun();
    }

    private static void testThatRunInWasRunMarksThatItWasRun() {
        WasRun test = new WasRun("testMethod");
        assert test.wasRun == false;
        test.run();
        myAssert(test.wasRun);
    }


    private static void myAssert(boolean b) {
        if (!b) {
            throw new AssertionError("Not true ");
        }
    }
}
