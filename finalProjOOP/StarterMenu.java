import java.util.Scanner;

public class StarterMenu {
    Addition addition = new Addition();
    Substraction substraction = new Substraction();
    Multiplication multiplication = new Multiplication();
    Division division = new Division();
    private double first;
    private double second;

    private double answer;

    private boolean stop = true;

    public void printMenu() {
        Scanner scanner = new Scanner(System.in);

        while (stop) {
            System.out.println("Выберите операцию, которые вы хотите произвести:\n" +
                    "1)+\n" +
                    "2)-\n" +
                    "3)*\n" +
                    "4)/\n" +
                    "5)Останость программу");
            int choice = scanner.nextInt();
            if (choice < 0 || choice > 5) {
                throw new IndexOutOfBoundsException("Вы ввели функции которой не существует");
            }
            else if (choice > 0 && choice < 6) {
                switch (choice) {
                    case 1:
                        System.out.println("Enter your first number:\n");
                        first = scanner.nextDouble();
                        System.out.println("Enter your second number:\n");
                        second = scanner.nextDouble();
                        answer = addition.calculation(first, second);
                        System.out.println("Ответ" + answer);
                        continue;

                    case 2:
                        System.out.println("Enter your first number:\n");
                        first = scanner.nextDouble();
                        System.out.println("Enter your second number:\n");
                        second = scanner.nextDouble();
                        answer = substraction.calculation(first,second);
                        System.out.println("Ответ" + answer);
                        continue;

                    case 3:
                        System.out.println("Enter your first number:\n");
                        first = scanner.nextDouble();
                        System.out.println("Enter your second number:\n");
                        second = scanner.nextDouble();
                        answer = multiplication.calculation(first,second);
                        System.out.println("Ответ" + answer);
                        continue;

                    case 4:
                        System.out.println("Enter your first number:\n");
                        first = scanner.nextDouble();
                        System.out.println("Enter your second number:\n");
                        second = scanner.nextDouble();
                        answer = division.calculation(first,second);
                        System.out.println("Ответ" + answer);
                        continue;

                    case 5:
                        answer = 0;
                        stop = false;
                        break;

                }
            } else {
                System.out.println("Something went wrong");
            }
        }
    }
}
