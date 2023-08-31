import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me your age");
        int age = scanner.nextInt();
        System.out.println("you should date someone who's at least " + (age/2 +7));

    }
}
