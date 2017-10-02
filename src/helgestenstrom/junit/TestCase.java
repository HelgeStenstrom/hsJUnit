package helgestenstrom.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
    boolean wasRun;
    String name;
    String log;

    TestCase(String name) {
        this.name = name;
    }

    void runParent(String name) {
    }

    public void methodsOfTest() {
        Method[] myMethods = getClass().getDeclaredMethods();
    }

    public void setUp() {}

    public void tearDown() {}

    TestResult run() {
        TestResult result = new TestResult();
        result.testStarted();
        setUp();
        try {
            runMethod();
        }
        catch (Exception e) {
            result.testFailed();
        }
        tearDown();
        return result;

    }

    private void runMethod() {
        Method toRun = null;
        try {
            toRun = getClass().getDeclaredMethod(this.name, new Class[0]);
        }
        catch (NoSuchMethodException e) {
            System.out.println("Hittade inte en sådan metod");
        }

        // TODO: lär mig hur en Exception kan stoppas från att komma igenom, men ändå loggas.
        try {
            toRun.invoke(this, new Class[0]);
        }
        catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException");
        }
        catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            e.getCause().printStackTrace();
            System.out.println("runMethod has got an InvocationTargetException");
            System.out.println(e.getCause().toString());
            System.out.println();
            // throw e.getCause();
        }
    }

    static void assertThat(boolean b) {
        assertThat(b, "Not true.");
    }

    static void assertThat(boolean b, String comment) {
        if (!b) {
            throw new AssertionError(comment);
        }
    }

}
