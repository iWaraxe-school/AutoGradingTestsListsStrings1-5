import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListAndStringsTest {

    @DisplayName("Largest element in a list")
    @Test
    void Should_ReturnLargestElementInAList() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        Integer expected = 7;
        Integer actual = ListAndStrings.largestElementInList(list);
        assertEquals(expected, actual);
    }

    @DisplayName("Reversed list")
    @Test
    void Should_ReturnReversedList() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> expected = List.of(7, 6, 5, 4, 3, 2, 1);
        List<Integer> actual = ListAndStrings.reversedList(list);
        assertEquals(expected, actual);
    }

    @DisplayName("Element contained in a list")
    @Test
    void Should_ReturnThatElementIsContained() {
        Integer element = 4;
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        boolean actual = ListAndStrings.elementOccurrence(list, element);
        assertEquals(true, actual);
    }

    @DisplayName("Element is not contained in a list")
    @Test
    void Should_ReturnThatElementIsNotContained() {
        Integer element = 10;
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        boolean actual = ListAndStrings.elementOccurrence(list, element);
        assertEquals(false, actual);
    }

    @DisplayName("List of odd position elements")
    @Test
    void Should_ReturnListFromOddPositionsElements() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> expected = List.of(1, 3, 5, 7);
        List<Integer> actual = ListAndStrings.oddPositionsList(list);
        assertEquals(expected, actual);
    }

    @DisplayName("Running total of a list")
    @Test
    void Should_ReturnRunningTotal() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> expected = List.of(1, 3, 6, 10, 15, 21, 28);
        List<Integer> actual = ListAndStrings.runningTotal(list);
        assertEquals(expected, actual);
    }
}
