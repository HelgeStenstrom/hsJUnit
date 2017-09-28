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

    void run() {
        Method toRun = null;
        setUp();
        runMethod(toRun);
        tearDown();
    }

    private void runMethod(Method toRun) {
        try {
            toRun = getClass().getDeclaredMethod(this.name, new Class[0]);
        }
        catch (NoSuchMethodException e) {
            System.out.println("Hittade inte en sådan metod");
        }

        try {
            toRun.invoke(this, new Class[0]);
        }
        catch (InvocationTargetException e) {
            e.printStackTrace();
            // https://stackoverflow.com/questions/6020719/what-could-cause-java-lang-reflect-invocationtargetexception
            // Done: Make sure the stack trace is printed.
            // TODO: Understand exception hierarchy and how AssertionError is related to InvocationTargetException
        }
        catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException");
        }
    }

    static void assertThat(boolean b) {
        assert b;
        if (!b) {
            throw new AssertionError("Not true ");
        }
    }

}
