import java.util.Scanner;
public class adjective {
    public static String getAdjective() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();
        return adjective;
    }
}
