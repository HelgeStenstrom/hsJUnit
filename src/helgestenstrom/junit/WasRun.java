package helgestenstrom.junit;

public class WasRun extends TestCase{

    boolean wasRun = false;

    public WasRun(String name) {
    }

    public void run() {
        testMethod();
    }

    public void  testMethod() {
        wasRun = true;
    }
}
