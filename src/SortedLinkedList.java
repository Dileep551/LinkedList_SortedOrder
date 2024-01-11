/*

(Inserting Elements in a LinkedList in Sorted Order)
Write a program that inserts 25 random integers from 0 to 100
in order into a LinkedList object. The program should sort the elements,
then calculate the sum of the elements and the floating-point average of the elements.

 */


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SortedLinkedList {

    private List<Integer> linkedList;

    public SortedLinkedList() {
        linkedList = new LinkedList<>();
    }

    public void insertRandomIntegers(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            linkedList.add(random.nextInt(101));
        }
    }

    public void sortElements() {
        Collections.sort(linkedList);
    }

    public int calculateSum() {
        int sum = 0;
        for (int num : linkedList) {
            sum += num;
        }
        return sum;
    }

    public double calculateAverage() {
        if (linkedList.isEmpty()) {
            return 0.0;
        }
        int sum = calculateSum();
        return (double) sum / linkedList.size();
    }

    public List<Integer> getSortedElements() {
        return new LinkedList<>(linkedList);
    }
}
