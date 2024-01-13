import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние до клиента");
        int distanceToClient = scanner.nextInt();
        if (distanceToClient < 20) {
            System.out.println("Потребуеться дней 1");
        } else if (distanceToClient < 60) {
            System.out.println("Потребуеться дней 2");
        } else if (distanceToClient < 100) {
            System.out.println("Потребуеться дней 3");
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}
