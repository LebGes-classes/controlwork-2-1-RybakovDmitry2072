import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    @Test
    void testAddAndGetElement() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(5);
        list.add(10);
        assertEquals(5, list.get(0));
        assertEquals(10, list.get(1));
    }

    @Test
    void testRemoveElement() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.remove(1);
        assertEquals("cherry", list.get(1));
        assertEquals(2, list.size());
    }

    @Test
    void testContainsElement() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("apple");
        list.add("banana");
        assertTrue(list.contains("apple"));
        assertFalse(list.contains("orange"));
    }

    @Test
    void testClearList() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    void testIndexOfElement() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(1, list.getIndex(20));
        assertEquals(-1, list.getIndex(15));
    }
}
