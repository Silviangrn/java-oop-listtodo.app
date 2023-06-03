package todolist.views;

import java.util.Scanner;

public class WelcomeViews {
    public static void main(String[] args) {
        ShowWelcomeView();
    }

    public static void ShowWelcomeView() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Welcome to My Todo Apps");
        System.out.println("=========================");
        System.out.println();
        System.out.println("[1] - Login Page");
        System.out.println("[2] - Create Account");
        System.out.println("[0] - Exit");
        System.out.println();
        System.out.println("Input Menu (Number):");
        Integer menu = inputScanner.nextInt();

        switch (menu) {
            case 1:
                LoginView.ShowLoginPage();
                break;
            case 2:
                System.out.println("go to menu Create User Page ");
                break;
            case 0:
                System.out.println("Application Closed!");
                break;
        }

        inputScanner.close();
    }

    public static void ShowAddUser() {
        
    }
}
