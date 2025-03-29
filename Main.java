import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ЗАДАНИЕ 1: сравнение двух целых чисел и арифметические операции
        System.out.println("=== ЗАДАНИЕ 1: Сравнение двух чисел и операции ===");

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        // Сравнение a и b
        if (a > b) {
            System.out.println("Результат сравнения: a > b");
        } else if (a < b) {
            System.out.println("Результат сравнения: a < b");
        } else {
            System.out.println("Результат сравнения: a = b");
        }

        // Арифметические операции
        int sum = a + b;
        int diff = a - b;
        int product = a * b;

        System.out.println("Сложение: a + b = " + sum);
        System.out.println("Вычитание: a - b = " + diff);
        System.out.println("Умножение: a * b = " + product);

        if (b != 0) {
            // Чтобы получить результат с плавающей точкой, делим как double
            double division = (double) a / b;
            System.out.println("Деление: a / b = " + division);
        } else {
            System.out.println("Деление: невозможно делить на ноль!");
        }

        // ЗАДАНИЕ 2: Сравнение двух строк
        // Очищаем «буфер» после nextInt()
        scanner.nextLine();

        System.out.println("\n=== ЗАДАНИЕ 2: Сравнение двух строк ===");
        System.out.print("Введите первую строку (a): ");
        String strA = scanner.nextLine();

        System.out.print("Введите вторую строку (b): ");
        String strB = scanner.nextLine();

        if (strA.equals(strB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // ЗАДАНИЕ 3: Вывод чётных чисел из массива
        System.out.println("\n=== ЗАДАНИЕ 3: Вывод чётных чисел из массива ===");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Чётные числа: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Закрываем сканер в конце
        scanner.close();
    }
}