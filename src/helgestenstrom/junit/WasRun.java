package helgestenstrom.junit;

public class WasRun extends TestCase{


    public WasRun(String name) {
        super(name);
    }

    public void setUp() {
        wasSetup = true;
        wasRun = false;
    }

    public void  testMethod() {
        wasRun = true;
    }
}
