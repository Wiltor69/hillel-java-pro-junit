import ua.hillel.junithw.arraylibrary.SimpleArraysLibrary;
import ua.hillel.junithw.mathlibrary.SimpleMathLibraryTest;
import ua.hillel.junithw.testrunner.TestRunner;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException {
          TestRunner testRunner = new TestRunner();
       System.out.println("------------------------Class name-----------------------------------------------------");
        testRunner.addClassName("ua.hillel.junithw.mathlibrary.SimpleMathLibraryTest");
        testRunner.addClassName("ua.hillel.junithw.arraylibrary.SimpleArraysLibraryTest");
        System.out.println("------------------------Type class name-----------------------------------------------------");
        testRunner.addTypeClassName(SimpleMathLibraryTest.class);
        System.out.println("------------------------Package name-----------------------------------------------------");
        testRunner.addPackageName("ua.hillel.junithw.mathlibrary");
        
        
        

    }
}

