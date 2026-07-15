package Excercises.Task1;

import java.util.Scanner;

public class Task1a {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int n = s.nextInt();
        if (n >= 18) {
            System.out.println("Jesteś pełnoletni.");
        } else System.out.println("Nie jesteś pełnoletni");
    }

}
