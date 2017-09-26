package helgestenstrom.junit;

public class WasRun extends TestCase{

    //boolean wasRunSub = false;
    // String name;

    public WasRun(String name) {
        super(name);
        // this.name = name;
    }

    public void run() {
        this.testMethod();
    }

    public void  testMethod() {
        //wasRunSub = true;
        wasRun = true;
    }
}
