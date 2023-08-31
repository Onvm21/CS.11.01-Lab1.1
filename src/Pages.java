import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me your age");
        int age = scanner.nextInt();
        Scanner words = new Scanner(System.in);
        System.out.println("type your name");
        String name = words.nextLine();
        System.out.println("hello " + name + " you should read " + (100-age) + " pages of a book before you drop it");


    }
}
