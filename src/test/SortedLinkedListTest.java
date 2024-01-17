import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortedLinkedListTest {

    @Test
    void testSortedLinkedList() {

        //Given
        SortedLinkedList sortedLinkedList = new SortedLinkedList();
        sortedLinkedList.insertRandomIntegers(25);
        sortedLinkedList.sortElements();

        //When
        List<Integer> sortedElements = sortedLinkedList.getSortedElements();
        int sum = sortedLinkedList.calculateSum();
        double average = sortedLinkedList.calculateAverage();

        //Then
        System.out.println("Sorted Elements: " + sortedElements);
        System.out.println("Sum of Elements: " + sum);
        System.out.println("Average of Elements: " + average);


        assertNotNull(sortedElements);
        assertEquals(25, sortedElements.size());
        assertEquals(sortedLinkedList.getSortedElements().stream().reduce(0, Integer::sum), sortedLinkedList.calculateSum());
        assertEquals((double) sortedLinkedList.getSortedElements().stream().reduce(0, Integer::sum) / 25, average);
    }

}