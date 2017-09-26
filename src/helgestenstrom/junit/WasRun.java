package helgestenstrom.junit;

public class WasRun extends TestCase{

    boolean wasRun = false;
    // String name;

    public WasRun(String name) {
        super(name);
        // this.name = name;
    }

    public void run() {
        this.testMethod();
    }

    public void  testMethod() {
        wasRun = true;
        wasRunParent = true;
    }
}
