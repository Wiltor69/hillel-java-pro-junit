package ua.hillel.junithw.arraylibrary;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class SimpleArraysLibraryTest {
    @BeforeEach
    public void setUp(){
        System.out.println("Start Arrays test");
    }
    @Test
    public void createArrayTest(){
        SimpleArraysLibrary simpleArraysLibrary = new SimpleArraysLibrary();
        int[] arr = new int[]{1, 2, 3, 8, 4, 5, 7};
        int [] arr1 = simpleArraysLibrary.createArray(arr);
        assert arr1 == new int[]{5, 7};
    }
    @AfterEach
    public void end(){
        System.out.println("Test Array finish");
    }
}
