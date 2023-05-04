
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class Example_2 {

    public static LinkedList<Integer> makeRandomLinkedList(int listLength) {
        Random random = new Random();
        LinkedList <Integer> randomLinkedList = new LinkedList<>();

        for (int i = 0; i < listLength; i++) {
            randomLinkedList.add(random.nextInt(50));
        }
        return randomLinkedList;
    }

    private static LinkedList<Integer> enqueue(LinkedList<Integer> linkedList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое хотите добавить в конец очереди: ");
        linkedList.add(sc.nextInt());
        sc.close();
        return linkedList;
    }


    private static LinkedList<Integer> dequeue(LinkedList<Integer> linkedList) {
        System.out.printf("Удаляем первый элемент: %d\n", linkedList.removeFirst());
        return linkedList;
    }

    private static void first(LinkedList<Integer> linkedList) {
        int number = linkedList.getFirst();
        System.out.printf("Выводим первый элемент, не удаляя его: %d\n", number);
    }

    public static void main(String[] args) {
        LinkedList<Integer> queue1 = makeRandomLinkedList(5);

        System.out.printf("Изначальная очередь: %s\n", queue1);
        System.out.println(enqueue(queue1));

        System.out.println(dequeue(queue1));
        first(queue1);

        System.out.printf("Итоговая очередь: %s", queue1);

    }
}
