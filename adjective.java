import java.util.Scanner;
public class adjective {
    public static String get_adjective() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();
        return adjective;
    }
    public static void main(String[] args) {
        String result = get_adjective();
}
