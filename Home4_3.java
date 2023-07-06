
//  В калькулятор добавьте возможность отменить последнюю операцию.
import java.util.Scanner;
import java.util.LinkedList;

public class Home4_3 {
    public static void main(String[] args) {
        System.out.println("Программа Калькулятор!");

        LinkedList<String> history = new LinkedList<>(); // Создаем LinkedList для хранения истории операций

        boolean cancel = false; // Флаг для отслеживания отмены операции
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("История операций:");
            for (String operation : history) {
                System.out.println(operation);
            }
            System.out.println("Введите знак действия (*,+,/,-) или 'cancel' для отмены последней операции, либо");
            System.out.println("введите exit для выхода из программы:");

            String action = scanner.nextLine();

            // Если введено 'cancel', отменяем последнюю операцию
            if (action.equalsIgnoreCase("cancel")) {
                if (!history.isEmpty()) {
                    history.removeLast(); // Удаляем последнюю операцию из истории
                    System.out.println("Последняя операция отменена.");
                } else {
                    System.out.println("История операций пуста.");
                }
                continue; // Возвращаемся к началу цикла
            }

            // Если флаг отмены установлен, пропускаем текущую итерацию
            if (cancel) {
                cancel = false;
                continue; // Возвращаемся к началу цикла
            }

            if (action.equalsIgnoreCase("exit")) {
  
                break; // Выходим из программы
            }

            System.out.println("Введите первое число:");
            int number1 = scanner.nextInt();

            System.out.println("Введите второе число:");
            int number2 = scanner.nextInt();

            scanner.nextLine(); // Очищаем буфер после ввода чисел

            String resultString = number1 + " " + action + " " + number2 + " = ";

            switch (action) {
                case "+":
                    resultString += (number1 + number2);
                    break;
                case "-":
                    resultString += (number1 - number2);
                    break;
                case "*":
                    resultString += (number1 * number2);
                    break;
                case "/":
                    if (number2 == 0) {
                        resultString = "Деление на ноль запрещено!";
                    } else {
                        resultString += (number1 / number2);
                    }
                    break;
                default:
                    System.out.println("Вы ввели неправильную операцию.");
                    continue; // Возвращаемся к началу цикла
            }

            System.out.println(resultString);

            history.add(resultString); // Добавляем операцию в историю
        }
        scanner.close();
        System.out.println("История операций:");
        for (String operation : history) {
            System.out.println(operation);
        }

    }
         
}
