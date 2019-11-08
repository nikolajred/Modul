import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Level2Test {

    @Test
    public void isValid() {
        Task1Level2 task1Level2 = new Task1Level2();
        Boolean actual = task1Level2.isValid("()()");
        Boolean expected = true;
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void isValidNull() {
        Task1Level2 task1Level2 = new Task1Level2();
        Boolean actual = task1Level2.isValid("");
        Boolean expected = true;
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void isValidFalse() {
        Task1Level2 task1Level2 = new Task1Level2();
        Boolean actual = task1Level2.isValid("({[]}){{");
        Boolean expected = false;
        Assert.assertEquals(actual, expected);

    }
}