package helgestenstrom.junit;

import java.lang.reflect.Method;

public class LearnReflection {
    Method minMetod;

    public void setMinMetod() {
        try {
            minMetod = getClass().getDeclaredMethod("hejsan", new Class[0]);
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException, hittade inte metoden.");
        }
    }
}
