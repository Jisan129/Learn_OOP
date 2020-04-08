package Bottles;

import org.junit.Assert;
import org.junit.Test;


public class BottlesTest {
    @Test
    public void verse_99()
    {
        String expected = "99 bottles of milk on the wall, 99 bottles of milk.\n"
                + "Take one down and pass it around, 98 bottles of milk on the wall.";
        String actual = new Bottles().verse(99);
        Assert.assertEquals(expected, actual);
    }
   @Test
    public void verse_2()
    {
        String expected = "2 bottles of milk on the wall, 2 bottles of milk.\n"
                + "Take one down and pass it around, 1 bottle of milk on the wall.";
        String actual = new Bottles().verse(2);
        Assert.assertEquals(expected, actual);
        // TODO: implement this
    }
   @Test
    public void verse_1()
    {
        String expected = "1 bottles of milk on the wall, 1 bottles of milk.\n"
                + "Take one down and pass it around, no more bottles of milk on the wall.";
        String actual = new Bottles().verse(1);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void verse_0()
    {
        String expected = "No bottles of milk on the wall, No more bottles of milk.\n"
                + "Go to the store and buy some more, 99 bottles of milk on the wall.";
        String actual = new Bottles().verse(0);
        Assert.assertEquals(expected, actual);

    }
}

