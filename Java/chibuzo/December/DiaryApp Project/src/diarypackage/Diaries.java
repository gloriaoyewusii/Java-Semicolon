package diarypackage;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries = new ArrayList<>();

    public Diaries() {
    }
    public int checkSize() {
        return diaries.size();
    }
    public void add(String username, String password) {
        diaries.add(new Diary(username, password));
    }

    public String getUsername() {
        return diaries.get(checkSize() - 1).getUsername();
    }
    public String getPassword() {
        return diaries.get(checkSize() - 1).getPassword();
    }

    public Diary findDiaryBy(String username) {
        if (username==null){
            username = diaries.get(checkSize() - 1).getUsername();
        }
        boolean usernameIsCorrect = username.equals(getUsername());
        if (usernameIsCorrect) return diaries.get(checkSize() - 1);
        else return null;
    }

    @Override
    public String toString() {
        return "" + diaries;
    }

    public void delete(String username, String password) {
        validateUsername(username);
        validatePassword(password);
        diaries.remove(findDiaryBy(username));
    }

    private void validatePassword(String password) {
        boolean passwordIsCorrect = password.equals(getPassword());
        if (!passwordIsCorrect) {
            throw new IllegalArgumentException("Passwords do not match");
        }
    }

    private void validateUsername(String username) {
        boolean usernameIsCorrect = username.equals(getUsername());
        if (!usernameIsCorrect) {
            throw new IllegalArgumentException("Username is not correct");
        }
    }
}
