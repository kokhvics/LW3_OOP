import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class SwapStacks {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер стека 1: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(100); // Генерация случайного числа от 0 до 99
            stack1.push(randomNumber);
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите размер стека 2: ");
        int size2 = scanner2.nextInt();

        for (int i = 0; i < size2; i++) {
            int randomNumber = random.nextInt(100); // Генерация случайного числа от 0 до 99
            stack2.push(randomNumber);
        }

        System.out.println("Исходные стеки:");
        System.out.println("Стек 1: " + stack1);
        System.out.println("Стек 2: " + stack2);

        swapStacks(stack1, stack2);

        System.out.println("Стеки после замены:");
        System.out.println("Стек 1: " + stack1);
        System.out.println("Стек 2: " + stack2);
    }

    public static void swapStacks(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> tempStack = new Stack<>();
        Stack<Integer> tempStack2 = new Stack<>();

        while (!stack1.isEmpty()) {
            tempStack.push(stack1.pop());
        }

        while (!stack2.isEmpty()) {
            tempStack2.push(stack2.pop());
        }

        while (!tempStack2.isEmpty()) {
            stack1.push(tempStack2.pop());
        }

        while (!tempStack.isEmpty()) {
            stack2.push(tempStack.pop());
        }

    }
}
