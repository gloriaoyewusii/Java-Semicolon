package diarypackage;

public class DiaryApp {
    private int size = 0;
    private int diaryCapacity;
    private String entry;
    private int entryId;
    private boolean isLocked;
    private String[] diary = new String[3];


    public DiaryApp() {
    }
    public boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }
    public String addEntry(String entry, int entryId) {
        if (isLocked == true) unlockDiary();
        if (diary[size] == null && diary[entryId - 1] == null) {
            diary[entryId - 1] = entry;
            size++;
            return diary[entryId - 1];
        } else if (diary[entryId - 1] != null) {
            diary[entryId - 1] = updateEntry(entryId, entry);
            size++;
            return diary[entryId - 1];
        } else if (diary[entryId - 1] != null) {
            diary[entryId - 1] = deleteEntry(entryId);
            size--;
            return diary[entryId - 1];
        }
        return null;
    }

    public String deleteEntry(int entryId) {
        if (diary[entryId - 1] != null) {
            diary[entryId - 1] = null;
            size--;
            return diary[entryId - 1];
        }
        return null;
    }

    public String findEntryById(int entryId) {
        this.entryId = entryId;
        if (diary[entryId - 1] == null) {
            diary[entryId - 1] = addEntry(entry, entryId);
            return diary[entryId - 1];
        } else if (diary[entryId - 1] != null) {
            entry = diary[entryId - 1];
            return entry;
        } else if (entryId >= diary.length) {
            increaseCapacity();
            return null;
        }
        return null;
    }

    public int increaseCapacity() {
        if (size == diary.length) {
            diaryCapacity = diary.length * 2;
            diary = new String[diaryCapacity];
            return diaryCapacity;
        }
        return diaryCapacity;
    }

    public int getSize() {
        return size;
    }

    public boolean isFull() {
        if (size == diary.length) return true;
        return false;
    }

    public boolean lockDiary() {
        isLocked = true;
        return isLocked;
    }

    public boolean unlockDiary() {
        isLocked = false;
        return true;
    }
    public String updateEntry(int entryId, String update) {
        if (diary[entryId - 1] != null) {
            diary[entryId - 1] += " " + update;
            return diary[entryId - 1];
        }
        return null;
    }
}
