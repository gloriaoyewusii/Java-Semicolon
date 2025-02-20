package diarypackage;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked = true;
    private List<Entry> entries =  new ArrayList<Entry>();
    private int entryCount = 0;

    public Diary(String userName, String password) {
        validateUsername(userName);
        validatePassword(password);
    }

    private void validatePassword(String password) {
        boolean passwordNotNull = password != null && !password.isEmpty();
        if (passwordNotNull) this.password = password;
    }

    private void validateUsername(String userName) {
        boolean userNameNotNull = userName != null && !userName.isEmpty();
        if (userNameNotNull) this.userName = userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Entry getEntry() {
        try {
            if (!entries.isEmpty()) {
                Entry entry = entries.get(entryCount - 1);
                return entry;
            }
        } catch (NullPointerException exception){
            exception.getMessage();
            System.out.println("No entry found");
        }
        return null;
    }
    public int getId(){
        int id = entryCount + 1;
        return id;

    }
    public void createEntry(String title, String body) {
        validateUsername(userName);
        validatePassword(password);

        int id = getId();
        try {
            Entry entry = new Entry(id, title, body);
            entries.add(entry);
            entryCount++;
        } catch (NullPointerException exception){
            exception.getMessage();
            System.out.println("Entry not created");
        }
    }
    public void deleteEntry(int id) {
        try{
            entries.remove(id-1);
            entryCount--;
//            if (entryCount == 1) System.out.println(entryCount + " entry deleted");
//            else System.out.println(entryCount + " entries deleted");
            System.out.println(getEntry());
        } catch (NullPointerException exception){
            exception.getMessage();
            System.out.println("Entry not deleted");
        }
    }

    public Entry findEntry(int id) {
        try {
            for (Entry entry : entries) {
                if (id > 0) {
                    entry = entries.get(id-1);
                }
                return entry;
            }

        } catch (NullPointerException exception){
            exception.getMessage();
            System.out.println("No entry found");
        }
        return null;
    }

    public void updateEntry(int id, String title, String body) {
        try{
            Entry entry = findEntry(id);
            if (entry != null) {
                entry.setEntryTitle(title);
            } else {
                System.out.println("No entry present");
            }
            if (body != null) {
                entry.setEntryContent(body);
            } else {
                System.out.println("No entry present");
            }
        } catch (NullPointerException exception){
            exception.getMessage();
            System.out.println("No entry found");
        }
    }

    public boolean isLocked() {
        if (isLocked)
            return true;
        return false;
    }
    public void lockDiary() {
        isLocked();
        System.out.println("Diary is locked.");
    }

    @Override
    public String toString() {
        return "Username: " + userName + "\nPassword: " + password;
    }

    public void unlockDiary(String password) {
        if (password.equals(this.password)) {
            isLocked = false;
            System.out.println("Diary successfully unlocked");
        }
    }

    public List<Entry> viewEntries() {
        return entries;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Diary diary) {
            
            return userName.equals(diary.userName) && password.equals(diary.password);
        }
        return false;
    }

}
