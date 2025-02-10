package diarypackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntryTest {

    @Test
    public void test_thatEntryIsEmpty() {
        Entry entry = new Entry();
        assertTrue(entry.isEmpty());
    }
    @Test
    public void test_thatEntryHasEntryID(){
        Entry entry = new Entry();
        entry.setEntryID(1);
        assertEquals(1, entry.getEntryID());
    }
    @Test
    public void test_thatEntryHasEntryTitle(){
        Entry entry = new Entry();
        entry.setEntryTitle("Test");
        assertEquals("Test", entry.getEntryTitle());
    }
    @Test
    public void test_thatEntryHasEntryContent(){
        Entry entry = new Entry();
        entry.setEntryContent("Test");
        assertEquals("Test", entry.getEntryContent());
    }
}
