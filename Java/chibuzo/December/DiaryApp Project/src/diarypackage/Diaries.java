package diarypackage;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private final List<Diary> diaries = new ArrayList<>();


    public Diaries() {
    }
    public int checkSize() {
        return diaries.size();
    }
    public void add(String username, String password) {
        Diary diary = new Diary(username, password);
        diaries.add(diary);
    }

    public Diary findDiaryBy(String username) {
        for (Diary diary : diaries) {
            if (diary == null || username==null || username.isEmpty()) {
                throw new IllegalArgumentException("Diary not found");
            } else if (diary.getUsername().equals(username)) {
                return diary;
            }
        }
         throw new IllegalArgumentException("Diary not found");
    }

    @Override
    public String toString() {
        return "" + diaries;
    }

    public void delete(String username, String password) {
        for (Diary diary : diaries) {
            if (findDiaryBy(username).getPassword().equals(password)) {
                diaries.remove(diary);
            }
        }
    }

//    private void validatePassword(String password) {
//        for (Diary diary : diaries) {
//            boolean passwordIsCorrect = password.equals(diary.getPassword());
//            if (!passwordIsCorrect) {
//                throw new IllegalArgumentException("Passwords do not match");
//            }
//        }
//    }
//
//    private void validateUsername(String username) {
//        for (Diary diary : diaries) {
//            boolean usernameIsCorrect = username.equals(diary.getUsername());
//            if (!usernameIsCorrect) {
//                throw new IllegalArgumentException("Usernames do not match");
//            }
//        }
//    }

}
