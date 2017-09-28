package helgestenstrom.junit;

public class WasRun extends TestCase{


    public WasRun(String name) {
        super(name);
    }

    public void setUp() {
        wasRun = false;
        log = "setUp ";
    }

    public void  testMethod() {
        wasRun = true;
        log += "testMethod ";
    }
}
