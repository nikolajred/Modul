import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Level1Test {

    @Test
    public void uniqNumber() {
        Task1Level1 task1Level1 = new Task1Level1();
        int[] array = {1, 1, 1, 2, 3, 8, 9};
        int actual = task1Level1.UniqNumber(array);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void uniqNumberNull() {
        Task1Level1 task1Level1 = new Task1Level1();
        int[] array = null;
        int actual = task1Level1.UniqNumber(array);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void uniqNumberZero() {
        Task1Level1 task1Level1 = new Task1Level1();
        int[] array = {0, 0, 0};
        int actual = task1Level1.UniqNumber(array);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
}