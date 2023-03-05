package ua.hillel.junithw.testrunner;


import org.junit.platform.console.ConsoleLauncher;
import ua.hillel.junithw.mathlibrary.SimpleMathLibraryTest;


import java.io.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class TestRunner {
    public void addClassName(String className) throws IOException {
        PrintStream pw = System.out;
       // PrintStream ps = System.err;
       // ConsoleLauncher.execute(pw, ps, String.format("-c %s",className));
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(bout);
        ConsoleLauncher.execute(ps, ps, String.format("-c %s",className));
        String resultString = bout.toString();
        PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\Hillel school\\HillelJavaProJUnit\\className.txt"));
        printWriter.println(resultString);
        printWriter.flush();
        System.out.println(resultString);
//       File file = new File("C:\\Hillel school\\HillelJavaProJUnit\\className.txt");
//        file.createNewFile();


    }
    public void addTypeClassName(Class<?> c) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException {
        Constructor<?> constructor= c.getDeclaredConstructor();
        SimpleMathLibraryTest smt = (SimpleMathLibraryTest) constructor.newInstance();
        PrintStream pw = System.out;
        //PrintStream ps = System.err;
//        File file = new File("C:\\Hillel school\\HillelJavaProJUnit\\typeClassName.txt");
//        file.createNewFile();

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(bout);
        ConsoleLauncher.execute(ps, ps, String.format("-c %s",smt.getClass().getName()));
        String resultString = bout.toString();
        PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\Hillel school\\HillelJavaProJUnit\\typeClassName.txt"));
        printWriter.println(resultString);
        printWriter.flush();
        System.out.println(resultString);
       // ConsoleLauncher.execute(pw, ps, String.format("-c %s", smt.getClass().getName()));
    }
    public void addPackageName(String packageName) throws IOException {
        PrintStream pw = System.out;
       // PrintStream ps = System.err;
//        File file = new File("C:\\Hillel school\\HillelJavaProJUnit\\packageName.txt");
//        file.createNewFile();
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(bout);
        ConsoleLauncher.execute(ps, ps, String.format("-c %s",packageName));
        String resultString = bout.toString();
        PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\Hillel school\\HillelJavaProJUnit\\packageName.txt"));
        printWriter.println(resultString);
        printWriter.flush();
        System.out.println(resultString);

      //  ConsoleLauncher.execute(pw, ps, String.format("-p %s",packageName));
    }
}
