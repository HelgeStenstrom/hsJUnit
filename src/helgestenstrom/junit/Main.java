package helgestenstrom.junit;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        testThatRunInWasRunMarksThatItWasRun();
        testCanBeTestCase();
        classHasAName();
        callMethodByName();
        compareStringLists();
        // findMethodsThatAreTests();
    }

    private static void testThatRunInWasRunMarksThatItWasRun() {
        WasRun test = new WasRun("testMethod");
        assertThat(!test.wasRun);
        test.run();
        assertThat(test.wasRun);
    }

    private static void testCanBeTestCase() {
        TestCase test = new WasRun("testMethod");
        assertThat(!test.wasRunParent);
        test.run();
        assertThat(test.wasRunParent);
    }

    private static void classHasAName() {
        TestCase test = new WasRun("testMethod");
        assertThat("testMethod".equals(test.nameInBaseClass));
    }

    private static void callMethodByName() {
        TestCase test = new WasRun("testMethod");
        assertThat(!test.wasRunParent);
        test.runByName();
        assertThat(test.wasRunParent);
        System.out.print(".");
    }

    private static void compareStringLists() {
        ArrayList<String> l1 = new ArrayList<String>();
        ArrayList<String> l2 = new ArrayList<String>();
        l1.add("One");
        l1.add("Two");
        l1.add("Three");
        l2.addAll(l1);
        assertThat(l1.equals(l1));
        assertThat(l1.equals(l2));
        l2.add("Four");
        assertThat(l1.contains("Two"));
        assertThat(!(l1.contains("Four")));
        assertThat(l2.contains("Four"));
        assertThat(l1.size() == 3);
        assertThat(l2.size() == 4);
    }

    private static void findMethodsThatAreTests() {
        TestCase test = new WasRun("testMethod");

        // TODO: lista över namn, ska jämföras med list från testFinder

        throw new NotImplementedException();

    }

    private static void assertThat(boolean b) {
        if (!b) {
            throw new AssertionError("Not true ");
        }
    }
}