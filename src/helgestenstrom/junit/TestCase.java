package helgestenstrom.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
    boolean wasRun;
    String name;

    public TestCase(String name) {
        this.name = name;
    }

    void runParent(String name) {
    }

    public void methodsOfTest() {
        Method[] myMethods = getClass().getDeclaredMethods();
        // return new String[["hej"]];
    }

    // void run() {}

    public void run() {
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
        catch (InvocationTargetException e) {
            System.out.println("InvocationTargetException");
        }
        catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException");
        }

    }

    protected static void assertThat(boolean b) {
        if (!b) {
            throw new AssertionError("Not true ");
        }
    }

}
