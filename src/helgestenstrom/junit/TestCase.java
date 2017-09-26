package helgestenstrom.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
    boolean wasRunParent;
    String nameInBaseClass;

    public TestCase(String name) {
        this.nameInBaseClass = name;
    }

    void runParent(String name) {
    }

    void runByName() {
        Method toRun = null;
        try {
            toRun = getClass().getDeclaredMethod(this.nameInBaseClass, new Class[0]);

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
    void run() {}
}
