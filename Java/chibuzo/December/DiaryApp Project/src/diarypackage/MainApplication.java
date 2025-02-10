package diarypackage;

import java.util.Scanner;

public class MainApplication {
    private static Diaries diaries;
    private static String username;

    public static void main(String[] args) {
       diaryMenu();
    }

    public static void diaryMenu() {
        print("Welcome!");
        print("""
                1. Sign up for a new diary account.
                2. Sign in to your account.
                3. View your diary accounts.
                4. Create a new entry.
                5. Find your entry by id.
                6. View your entries.
                7. Switch diary accounts.
                8. Delete your diary account.
                9. Delete your entry.
                10. Sign out of your account.
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
                viewDiaries();
                break;
            case "4":
                createEntry();
                break;
            case "5":
                viewEntries();
            case "6":
                switchDiaryAccounts();
                break;
            default:
                signOut();
        }
    }

    public static void switchDiaryAccounts(){
        String userName = input("Enter your username: ");
        if (userName.equals(diaries.getUsername()) && diaries.findDiaryBy(userName) != null){
            print("You are already logged in!");
            diaries.findDiaryBy(userName);
            diaryMenu();
        }
        diaryMenu();
    }

    public static void viewEntries(){

        print(diaries.findDiaryBy(username).viewEntries().toString());


//        int entryID = diaries.findDiaryBy(username).findEntry(entryId).getEntryID();
//        boolean entryIsNull = diaries.findDiaryBy(username).findEntry(entryID) == null;
//
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
    public static void createEntry(){
        int entryID = diaries.findDiaryBy(username).getId();
        String title = input("Enter your title: ");
        String content = input("Enter your content: ");


        if (username==null && diaries==null){
            diaries = new Diaries();
            username = diaries.getUsername();
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
    public MainApplication(Diaries diaries, String username) {
        this.diaries = diaries;
        this.username = username;
    }

    public static void signOut(){
        System.exit(0);

        diaryMenu();
    }
    public static void viewDiaries() {
        print(diaries.toString());
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
        if (!passwordIsCorrect) {
            throw new IllegalArgumentException("Invalid password");
        } else
            print("Password correct!");
    }

    private static void validateUsername(String username) {
        boolean usernameIsCorrect = username != null && !username.isEmpty();
        if (!usernameIsCorrect) {
            throw new IllegalArgumentException("Invalid username provided");
        } else
            print("Username correct!");
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

        diaryMenu();
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