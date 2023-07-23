import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class MySequenceTest {
    private final MySequence mySequence = new MySequence();

    /* out of bounds test */
    @Test
    public void outOfBoundsTest1() {
        assertEquals(mySequence.calculate(-1), "-1");
    }
    @Test
    public void outOfBoundsTest2() {
        assertEquals(mySequence.calculate(3), "-1");
    }
    @Test
    public void outOfBoundsTest3() {
        assertEquals(mySequence.calculate(100), "-1");
    }

    /* test */
    @Test
    public void test1() {
        assertEquals(mySequence.calculate(4), "21");
    }
    @Test
    public void test2() {
        assertEquals(mySequence.calculate(5), "12");
    }
    @Test
    public void test3() {
        assertEquals(mySequence.calculate(6), "22");
    }
    @Test
    public void test4() {
        assertEquals(mySequence.calculate(7), "12");
    }
    @Test
    public void test5() {
        assertEquals(mySequence.calculate(8), "21");
    }

    /* memo */
    @Ignore
    @Test(timeout = 1000)
    public void mustFailedTest() throws InterruptedException {
        Thread.sleep(1500);
        assertEquals(mySequence.calculate(4), "21");
    }
}