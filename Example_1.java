// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class Example_1 {
    public static LinkedList<Integer> makeRandomLinkedList(int listLength) {
        Random random = new Random();
        LinkedList <Integer> randomIntegerList = new LinkedList<>();

        for (int i = 0; i < listLength; i++) {
            randomIntegerList.add(random.nextInt(50));
        }

        return randomIntegerList;
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> copy = (LinkedList<Integer>) linkedList.clone();
        LinkedList<Integer> reversedList = new LinkedList<>();
        
        while (!copy.isEmpty()){
            reversedList.add(copy.removeLast());
        }

        return reversedList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> LinkedList1 = makeRandomLinkedList(10);

        System.out.print("Изначальный список: ");
        System.out.println(LinkedList1);

        System.out.print("Перевернутый список: ");
        System.out.println(reverseLinkedList(LinkedList1));
    }
}
