package task_11;

public class CharacterCounter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No strings provided.");
            return;
        }

        int totalCharacters = 0;
        for (String str : args) {
            int len = str.length();
            totalCharacters += len;
            System.out.println("String '" + str + "' contains " + len + " characters.");
        }

        System.out.println("Total number of characters in all strings: " + totalCharacters);
    }
}