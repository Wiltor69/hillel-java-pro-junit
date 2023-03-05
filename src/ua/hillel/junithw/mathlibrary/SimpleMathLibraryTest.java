package ua.hillel.junithw.mathlibrary;

import org.junit.jupiter.api.*;

public class SimpleMathLibraryTest {
    @BeforeEach
    public void setUp(){
        System.out.println("Start Math test");
    }
    @Test
    public void addTest_success(){
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        double actual = simpleMathLibrary.add(5, 3);
        assert actual == 8;
    }
    @Test
    public void minusTest_success(){
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        double actual = simpleMathLibrary.add(5, 3);
        assert actual == 2;
    }
    @AfterEach
    public void end(){
        System.out.println("Test Math finish");
    }
}
