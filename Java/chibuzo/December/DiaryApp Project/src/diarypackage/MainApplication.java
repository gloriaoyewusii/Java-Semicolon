package diarypackage;

import java.util.Scanner;

public class MainApplication {
    private static Diaries diaries;
    private static String username;

    public static void main(String[] args) {
       diaryMenu();
    }

    public static void diaryMenu() {
        print("Welcome to Gloria's Diary Application!");
        print("""
                Accounts Management System
                1. Sign up for a new diary account.
                2. Sign in to an existing diary account.
                Diary Management System
                3. Find diary account by username.
                4. View diary accounts you've signed up for.
                5. Delete a diary account.
                Entries Management System
                6. Create a new entry.
                7. Update an existing entry.
                8. Find entry by ID.
                9. Find all entries.
                10. Delete entry by ID.
                11. Sign out
                """);

        String diaryChoice = input("Select an option: ");
        switch (diaryChoice){
            case "1":
                signUp();
                break;
            case "2":
                signIn();
                break;
            case "3":
                findDiaryByUsername();
                break;
            case "4":
                viewDiaries();
                break;
            case "5":
                deleteDiary();
                break;
            case "6":
                createEntry();
                break;
            case "7":
                updateEntry();
                break;
            case "8":
                findEntryByID();
                break;
            case "9":
                viewEntries();
                break;
            case "10":
                deleteEntry();
            default:
                signOut();
        }
    }



    private static void deleteEntry() {
        int entryID = Integer.parseInt(input("Enter entry ID: "));
        diaries.findDiaryBy(username).deleteEntry(entryID);
        print("Entry number " + entryID + " has successfully been deleted.");
        diaryMenu();
    }
    public static void viewEntries(){

        print(diaries.findDiaryBy(username).viewEntries().toString());

//
//        if (diaries == null && entryIsNull){
//            diaries = new Diaries();
//            diaries.findDiaryBy(username).findEntry(entryID);
//            print(diaries.findDiaryBy(username).findEntry(entryID).toString());
//        }
//        if (diaries != null) {
//            diaries.findDiaryBy(username).findEntry(entryID);
//            print(diaries.findDiaryBy(username).findEntry(entryID).toString());
//        }
        diaryMenu();
    }
    private static void findEntryByID() {
        int entryID = Integer.parseInt(input("Enter entry ID: "));
        for (int index = 0; index < diaries.checkSize(); index++) {
            Entry entry = diaries.findDiaryBy(username).findEntry(entryID);
            if (entry != null) {
                print("Found entry with ID: " + entryID);
                print(entry.toString());
            }
        }
        diaryMenu();
    }

    private static void updateEntry() {
        int entryID = Integer.parseInt(input("Enter entry ID: "));
        String title = input("Enter title: ");
        String content = input("Enter content: ");
        diaries.findDiaryBy(username).updateEntry(entryID, title, content);
        diaryMenu();
    }
    public static void createEntry(){
        int entryID = diaries.findDiaryBy(username).getId();
        String title = input("Enter your title: ");
        String content = input("Enter your content: ");


        if (username==null && diaries==null){
            diaries = new Diaries();
            username = diaries.findDiaryBy(username).getUsername();
//            username = diaries.getUsername();
            diaries.findDiaryBy(username).createEntry(title, content);
            diaries.findDiaryBy(username).getEntry().setEntryID(entryID);
        }

        boolean entryIsNull = diaries.findDiaryBy(username).getEntry() == null;

//        if (diaries==null){
//            diaries = new Diaries();
//            diaries.findDiaryBy(username).getEntry().setEntryID(entryID);
//            diaries.findDiaryBy(username).createEntry(title, content);
//        }

        if (diaries!=null && entryIsNull){
            diaries.findDiaryBy(username).createEntry(title, content);
            diaries.findDiaryBy(username).getEntry().setEntryID(entryID);
        }
        if (diaries!=null && (!entryIsNull)){
            diaries.findDiaryBy(username).createEntry(title, content);
//            diaries.findDiaryBy(username).getEntry().setEntryID(entryID);
        }

        diaryMenu();
//        try{
//            diaries = null;
//            diaries = new Diaries();
//            diaries.findDiaryBy(username).getEntry().setEntryID(entryId);
//            diaries.findDiaryBy(username).findEntry(entryId).setEntryTitle(title);
//            diaries.findDiaryBy(username).findEntry(entryId).setEntryContent(content);
//            print("Entry created successfully.");
//        } catch (Exception e){
//            print("Invalid operation, kindly create a diary to create a new entry.");
//        }

    }

    public static void signOut(){
        System.exit(0);
        diaryMenu();
    }
    private static void deleteDiary() {
        if (diaries != null){
            diaries.delete(username, diaries.findDiaryBy(username).getPassword());
//            diaries.delete(username, diaries.getPassword());
        }

    }
    public static void viewDiaries() {
        print(diaries.toString());
        diaryMenu();
    }
    private static void findDiaryByUsername() {
        String name = input("Enter your username: ");
        if (name.equals(username)) {
            Diary diary = diaries.findDiaryBy(username);
            print(diary.toString());
        }
        diaryMenu();
    }
    public static void signIn(){
        print("\nEnter your username and password to sign in below");
        String username = input("Username: ");
        String password = input("Password: ");
        try {
            validateDiary(username, password);
        } catch (NullPointerException exception) {
            print(exception.getMessage());
        }
        diaryMenu();

    }

    private static void validateDiary(String username, String password) {
        Diary diary = new Diary(username, password);
        boolean isDiaryName = diary.getUsername().equals(diaries.findDiaryBy(username).getUsername());
        boolean isDiaryPassword = diary.getPassword().equals(diaries.findDiaryBy(username).getPassword());
        if (diaries!=null && isDiaryName && isDiaryPassword){
            print("\nDiary found. You have logged in successfully!");
        } else
            throw new NullPointerException("Diary could not be found!");
    }

    private static void validateUserDetails(String username, String password) {
        validateUsername(username);
        validatePassword(password);
    }
    private static void validatePassword(String password) {
        boolean passwordIsCorrect = password != null && !password.isEmpty();
        if (!passwordIsCorrect)
            throw new IllegalArgumentException("Invalid password");
    }

    private static void validateUsername(String username) {
        boolean usernameIsCorrect = username != null && !username.isEmpty();
        if (!usernameIsCorrect)
            throw new IllegalArgumentException("Invalid username provided");
    }

    public static void signUp() {
        username = input("Create a username: ");
        String password = input("Create a password: ");

        if (diaries!=null && diaries.findDiaryBy(username)!=null){
            if (username.equals(diaries.findDiaryBy(username).getUsername())){
                print("\n Username already exists!");
            }
            signUp();
        }

        Diary diary = new Diary(username, password);
        validateUserDetails(username, password);
        if (diaries==null) diaries = new Diaries();
        diaries.add(diary.getUsername(), diary.getPassword());
        print("Diary created successfully!");
        signIn();
    }
    public MainApplication(Diaries diaries, String username) {
        MainApplication.diaries = diaries;
        MainApplication.username = username;
    }
    private static String input(String prompt){
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        return scanner.nextLine();
    }
    private static void print(String prompt){
        System.out.println(prompt);
    }
}