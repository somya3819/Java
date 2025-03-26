import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username;
        String password;
        System.out.println("enter username:");
        Scanner s = new Scanner(System.in);
        username = s.nextLine();
        System.out.println("enter password:");
        password = s.nextLine();

        if (username.equals("root") && password.equals("admin")) {
            System.out.println("congo u logged in ");
        } else {
            System.out.println("sorry");

        }
    }}
