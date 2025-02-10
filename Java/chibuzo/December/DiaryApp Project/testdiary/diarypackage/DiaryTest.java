package diarypackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    @Test
    public void test_thatDiaryOwnerHasUserName_diaryOwnerHasPassword_returnsUserNameAndPassword() {
        Diary diary = new Diary("name", "password");

        assertEquals("password", diary.getPassword());
        assertEquals("name", diary.getUsername());
    }
    @Test
    public void test_thatDiaryHasListOfEntries_whenEntriesAreNotCreated_returnsNull(){
        Diary diary = new Diary("name", "password");

        assertNull(diary.getEntry());
    }
    @Test
    public void test_thatDiaryHasListOfEntries_whenEntriesAreCreated_returnsEntry(){
        Diary diary = new Diary("name", "password");
        diary.getEntry();

        diary.createEntry("New day", "It's a new day");
        Entry entry = diary.getEntry();
        assertEquals(entry, diary.getEntry());
    }
    @Test
    public void test_thatICreateTwoEntries_idReturnsTwoEntries(){
        Diary diary = new Diary("name", "password");
        diary.getEntry();

        diary.createEntry("New day", "It's a new day");
        diary.createEntry("New month", "It's a new month");
        Entry entry = diary.getEntry();
        assertEquals(entry, diary.getEntry());
    }
    @Test
    public void test_thatICreateTwoEntries_whenIDeleteOneEntry_returnsOneEntry(){
        Diary diary = new Diary("name", "password");
        diary.getEntry();

        diary.createEntry("New day", "It's a new day");
        diary.createEntry("New month", "It's a new month");

        diary.deleteEntry(1);
        Entry entry = diary.getEntry();
        assertEquals(entry, diary.getEntry());
    }
    @Test
    public void test_thatICreateThreeEntries_whenIFindAnEntryById_returnsTheEntry(){
        Diary diary = new Diary("name", "password");

        diary.createEntry("New day", "It's a new day");
        diary.createEntry("New month", "It's a new month");
        diary.createEntry("New year", "It's a new year");

        System.out.println(diary.findEntry(1));
        System.out.println(diary.findEntry(2));
    }
    @Test
    public void test_thatICreateAnEntry_whenIAddToAnExistingEntry_returnsUpdatedEntry(){
        Diary diary = new Diary("name", "password");
        diary.createEntry("New day", "It's a new day");

        diary.updateEntry(1, "A New Day", "It's a new day here.");
        System.out.println(diary.findEntry(1));
    }
    @Test
    public void test_thatICreateADiary_whenILockIt_diaryIsLocked(){
        Diary diary = new Diary("myName", "myPassword");

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }
    @Test
    public void test_thatICreateADiary_whenIUnlockIt_diaryIsUnlocked(){
        Diary diary = new Diary("myName", "myPassword");
        diary.lockDiary();
        assertTrue(diary.isLocked());

        diary.unlockDiary("myPassword");
        assertFalse(diary.isLocked());

    }
    @Test
    public void test_thatICreateADiary_iAddTwoEntries_whenIViewEntries_returnsTwoEntries(){
        Diary diary = new Diary("myName", "myPassword");
        diary.createEntry("New day", "It's a new day");
        diary.createEntry("New month", "It's a new month");

        System.out.println(diary.viewEntries());
    }
}
