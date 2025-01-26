package diarypackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryAppTest {
    @Test
    public void test_thatDiaryIsEmpty() {
        DiaryApp diaryApp = new DiaryApp();
        assertTrue(diaryApp.isEmpty());
    }
    @Test
    public void test_thatUserCanAddEntryToDiary() {
        DiaryApp diaryApp = new DiaryApp();
        assertEquals("My first entry", diaryApp.addEntry("My first entry", 1));
    }
    @Test
    public void test_thatUserCanRemoveEntryFromDiary() {
        DiaryApp diaryApp = new DiaryApp();
        assertEquals("My first entry", diaryApp.addEntry("My first entry", 1));
        assertEquals(null, diaryApp.deleteEntry(1));
    }
    @Test
    public void test_thatUserCanAddMultipleEntries() {
        DiaryApp diaryApp = new DiaryApp();
        assertEquals("My first entry", diaryApp.addEntry("My first entry", 1));
        assertEquals("My second entry", diaryApp.addEntry("My second entry", 2));
        assertEquals("My third entry", diaryApp.addEntry("My third entry", 3));
    }
    @Test
    public void test_thatUserCanRemoveMultipleEntries() {
        DiaryApp diaryApp = new DiaryApp();
        assertEquals("My first entry", diaryApp.addEntry("My first entry", 1));
        assertEquals("My second entry", diaryApp.addEntry("My second entry", 2));
        assertEquals("My third entry", diaryApp.addEntry("My third entry", 3));

        assertEquals(null, diaryApp.deleteEntry(1));
        assertEquals(null, diaryApp.deleteEntry(2));
        assertEquals(null, diaryApp.deleteEntry(3));
    }
    @Test
    public void test_thatUserCanFindEntryByEntryId(){
        DiaryApp diaryApp = new DiaryApp();
        assertEquals("My first entry", diaryApp.addEntry("My first entry", 1));
        assertEquals("My second entry", diaryApp.addEntry("My second entry", 2));
        assertEquals("My third entry", diaryApp.addEntry("My third entry", 3));
        assertEquals("My third entry", diaryApp.findEntryById(3));
    }
    @Test
    public void test_thatUserCanGetSizeOfDiary() {
        DiaryApp diaryApp = new DiaryApp();
        assertEquals("My first entry", diaryApp.addEntry("My first entry", 1));
        assertEquals("My second entry", diaryApp.addEntry("My second entry", 2));
        assertEquals("My third entry", diaryApp.addEntry("My third entry", 3));

        assertEquals(null, diaryApp.deleteEntry(3));
        assertEquals(2, diaryApp.getSize());
        assertNotEquals("My third entry", diaryApp.findEntryById(3));
    }
    @Test
    public void test_thatDiaryCapacityIsFull() {
        DiaryApp diaryApp = new DiaryApp();
        assertFalse(diaryApp.isFull());
    }
    @Test
    public void test_thatDiaryCapacityCanIncrease(){
        DiaryApp diaryApp = new DiaryApp();
        assertEquals("My first entry", diaryApp.addEntry("My first entry", 1));
        assertEquals("My second entry", diaryApp.addEntry("My second entry", 2));
        assertEquals("My third entry", diaryApp.addEntry("My third entry", 3));

        assertEquals(6, diaryApp.increaseCapacity());
    }
    @Test
    public void test_thatWhenSizeIsFull_andIFindEntryByEntryIdGreaterThanDiarySize_diaryCapacityIncreases_andReturnsNull(){
        DiaryApp diaryApp = new DiaryApp();
        assertEquals("My first entry", diaryApp.addEntry("My first entry", 1));
        assertEquals("My second entry", diaryApp.addEntry("My second entry", 2));
        assertEquals("My third entry", diaryApp.addEntry("My third entry", 3));
        assertEquals(6, diaryApp.increaseCapacity());
        assertEquals(null, diaryApp.findEntryById(4));
    }
    @Test
    public void test_thatUserCanLockDiary() {
        DiaryApp diaryApp = new DiaryApp();
        assertTrue(diaryApp.lockDiary());
    }
    @Test
    public void test_thatUserCanUnlockDiary() {
        DiaryApp diaryApp = new DiaryApp();
        assertTrue(diaryApp.unlockDiary());
    }
    @Test
    public void test_thatUserCanUpdateDiaryEntry() {
        DiaryApp diaryApp = new DiaryApp();
        assertEquals("My first entry.", diaryApp.addEntry("My first entry.", 1));

        assertEquals("My first entry. Updated.", diaryApp.updateEntry(1, "Updated."));
        assertEquals("My first entry. Updated. It's working, yayyy!", diaryApp.updateEntry(1, "It's working, yayyy!"));

    }
}
