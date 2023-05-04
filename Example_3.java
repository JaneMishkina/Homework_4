
/*
Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. 
Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
Например:
5 4 3 - + => 5 1 + => 6
1 2 + 3 * => 3 3 * => 9
1 2 3 * + => 1 6 + => 7
*/


// import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Example_3 {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
            //System.out.println("Введите целое число");
            
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите данные в формате double в виде обратной польской записи: ");
        String input = scan.nextLine();
        scan.close();
        String[] arr = input.split(" ");

        System.out.println(Arrays.toString(arr));

        Stack<Double> stack = new Stack<>();
        double res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isDigit(arr[i])) {
                stack.push(Double.parseDouble(arr[i]));
            } else {
                switch (arr[i]) {
                    case "+":
                        res = stack.pop() + stack.pop();
                        stack.push(res);
                        break;

                    case "-":
                        res = -stack.pop() + stack.pop();
                        stack.push(res);
                        break;

                    case "*":
                        res = stack.pop() * stack.pop();
                        stack.push(res);
                        break;

                    case "/":
                        double temp = stack.pop();
                        res = stack.pop() / temp;
                        stack.push(res);
                        break;
                }
            }
        }

        if (stack.size() > 1) {
            System.out.println("Неверная запись");
        } else {
            System.out.println(stack.pop());
        }

    }
}