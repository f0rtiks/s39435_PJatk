import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void simpleTest(){
        assertArrayEquals(Main.generateTestArray(), Main.generateTestArray());
    }

    @RepeatedTest(10)
    void simpleTestR(){
        assertArrayEquals(Main.generateTestArray(), Main.generateTestArray());
    }

    @Test
    void manualPerFest(){ // 889200
        long firstTime = System.nanoTime();
        Main.generateTestArray();
        System.out.println(System.nanoTime() - firstTime);
    }

    @Test
    @Tag("preformance")
    void simpleTestP(){
        assertArrayEquals(Main.generateTestArray(), Main.generateTestArray());
    }

    @Test
    @Timeout(1)
    void finalTest(){
        simpleTest();
    }



}