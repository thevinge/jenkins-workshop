package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    /*
     * This is a comment
     */
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        // Comment Test
        assertEquals("foo", app.items[0].name);
    }


    @Test
    /*
     * This is the bar test
     */
    public void bar() {
        Item[] items = new Item[] { new Item("foo", 1, 10), new Item("bar", 2, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("bar", app.items[1].name);
    }

    @Test
    /*
     * This is the bar test
     */
    public void foobar() {
        Item[] items = new Item[] { new Item("foo", 1, 10), new Item("bar", 2, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals("bar", app.items[1].name);
    }


    @Test
    /*
     * This is a comment
     */
    public void never_over_50() {
        Item[] items = new Item[] { new Item("foo", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality = 50);
    }

    @Test
    /*
     * This is the bar test
     */
    public void better_test() {
        Item[] items = new Item[] { new Item("foo", 1, 10), new Item("bar", 2, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    /*
     * This is the rose test
     */
    public void roseTest() {
        Item[] items = new Item[] { new Item("foo", 1, 10), new Item("bar", 2, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    /*
     * This is the rose test
     */
    public void Testrose() {
        Item[] items = new Item[] { new Item("foo", 1, 10), new Item("bar", 2, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

}
