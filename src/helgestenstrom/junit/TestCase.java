package helgestenstrom.junit;

import sun.reflect.annotation.ExceptionProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
    boolean wasRun;
    String name;
    String log;

    TestCase(String name) {
        this.name = name;
    }


    public void methodsOfTest() {
        Method[] myMethods = getClass().getDeclaredMethods();
    }

    public void setUp() {}

    public void tearDown() {}

    void run(TestResult result) {
        result.testStarted();
        setUp();
        try {
            runMethod();
        }
        catch (Throwable e) {
            result.testFailed();
            e.printStackTrace();
        }
        tearDown();
    }

    private void runMethod() throws Throwable {
        Method toRun = null;
        try {
            toRun = getClass().getDeclaredMethod(this.name, new Class[0]);
        }
        catch (NoSuchMethodException e) {
            System.out.println("Hittade inte en sådan metod");
        }

        try {
            toRun.invoke(this, new Class[0]);
        }
        catch (IllegalAccessException e) {
            // We couldn't even start the execution of the invoked method.
            System.out.println("IllegalAccessException");
        }
        catch (InvocationTargetException e) {
            // We could invoke the method, but it threw an exception. We need to deal with it.
            Throwable cause = e.getCause();
            throw cause;
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
