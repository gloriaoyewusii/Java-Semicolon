package diarypackage;

public class Entry {
    private boolean isEmpty;
    private String entryTitle;
    private String entryContent;
    private int entryID;


    public Entry(){
    }

    public Entry(int entryID, String entryTitle, String entryContent) {
        this.entryID = entryID;
        this.entryTitle = entryTitle;
        this.entryContent = entryContent;
    }
    public boolean isEmpty() {
        isEmpty = true;
        return isEmpty;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public void setEntryTitle(String entryTitle) {
        this.entryTitle = entryTitle;
    }

    public String getEntryContent() {
        return entryContent;
    }

    public void setEntryContent(String entryContent) {
        this.entryContent = entryContent;
    }

    public int getEntryID() {
        return entryID;
    }

    public void setEntryID(int entryID) {
        this.entryID = entryID;
    }

    @Override
    public String toString() {
        return "ID: " + entryID + "\nTitle: " + entryTitle + "\nBody: " + entryContent;
    }
}
