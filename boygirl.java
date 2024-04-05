import java.util.Scanner;

public class boygirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        scanner.close();

        int distinctCount = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            if (username.indexOf(c) >=0) {
                distinctCount++;
            }
        }

        if (distinctCount % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
