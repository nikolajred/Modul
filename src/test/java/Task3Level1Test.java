import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Level1Test {

    @Test
    public void searchAreaTriangle() {
        Task3Level1 task3Level1 = new Task3Level1();
        int actual = task3Level1.searchAreaTriangle(1,2,3,6,8,9);
        int expected = 7;
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void searchAreaTriangleNull() {
        Task3Level1 task3Level1 = new Task3Level1();
        int actual = task3Level1.searchAreaTriangle(1,2,1,2,8,9);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void searchAreaTriangleZero() {
        Task3Level1 task3Level1 = new Task3Level1();
        int actual = task3Level1.searchAreaTriangle(0,0,0,0,0,0);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }
}