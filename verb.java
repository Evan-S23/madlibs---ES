import java.util.Scanner;
public class verb {
    public static String getVerb() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();
        return verb;
    }
    public static void main(String[] args) {
        String result = getVerb();
}
