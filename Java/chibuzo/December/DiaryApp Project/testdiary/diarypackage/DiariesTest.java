package diarypackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DiariesTest {
    @Test
    public void test_thatDiariesIsEmpty() {
        Diaries diaries = new Diaries();
        assertEquals(0, diaries.checkSize());
    }
    @Test
    public void test_thatWhenIAddDiaryToDiaries_sizeIsOne_andDiariesIsNotEmpty() {
        Diaries diaries = new Diaries();
        diaries.add("name", "password");
        assertEquals(1, diaries.checkSize());
        assertNotEquals(0, diaries.checkSize());
    }
    @Test
    public void test_thatIAddDiaryToDiaries_sizeIsOne_diariesIsNotEmpty_andICanRetrieveUserDetails(){
        Diaries diaries = new Diaries();
        diaries.add("name", "password");
        assertEquals(1, diaries.checkSize());
        assertNotEquals(0, diaries.checkSize());

        assertEquals("name", diaries.getUsername());
        assertEquals("password", diaries.getPassword());
    }
    @Test
    public void test_thatIAddDiaryToDiaries_sizeIsOne_iRetrieveUserDetails_whenIfindDiaryByUsername_returnsDiary(){
        Diaries diaries = new Diaries();
        Diary diary = new Diary("name", "password");
        diaries.add(diary.getUsername(), diary.getPassword());
        assertEquals("name", diaries.getUsername());
        assertEquals("password", diaries.getPassword());

        Diary diary2 = new Diary("name2", "password2");
        diaries.add(diary2.getUsername(), diary2.getPassword());
        assertEquals("name2", diaries.getUsername());
        assertEquals("password2", diaries.getPassword());

        assertEquals(2, diaries.checkSize());

        diaries.findDiaryBy("name");
        System.out.println(diaries);
        System.out.println(diary);
//      assertEquals(diary, diaries.findDiaryBy("name"));
    }
    @Test
    public void test_thatIAdd2DiariesToDiariesList_whenIDeleteOneDiary_sizeReturnsOne(){
        Diaries diaries = new Diaries();
        Diary diary = new Diary("name", "password");
        diaries.add(diary.getUsername(), diary.getPassword());

        assertEquals(1, diaries.checkSize());


        Diary diary2 = new Diary("name2", "password2");
        diaries.add(diary2.getUsername(), diary2.getPassword());
        assertEquals(2, diaries.checkSize());
        diaries.delete("name2", diary2.getPassword());

        assertEquals(1, diaries.checkSize());
    }
}
