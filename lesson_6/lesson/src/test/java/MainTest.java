import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void findLastForAndCopyAfterOne() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {5, 6, 7, 8, 9, 10};
        int[] actual = Main.findLastForAndCopyAfter(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastForAndCopyAfterTwo() {
        int[] input = {5, 7, 8, 1, 3, 2, 4};
        int[] expected = {4, 3};
        int[] actual = Main.findLastForAndCopyAfter(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastForAndCopyAfterTree() {
        int[] input = {8, 2, 4, 7, 9, 10};
        assertThrows(RuntimeException.class, () -> Main.findLastForAndCopyAfter(input));
    }

    @Test
    void findLastForAndCopyAfterFour() {
        int[] input = {};
        assertThrows(RuntimeException.class, () -> Main.findLastForAndCopyAfter(input));
    }

    @Test
    void checkSequenceOne() {
        int[] input = {2, 5, 6, 4, 8, 2};
        boolean expected = true;
        boolean actual = Main.checkSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    void checkSequenceTwo() {
        int[] input = {2, 3, 4, 7};
        boolean expected = true;
        boolean actual = Main.checkSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    void checkSequenceThree() {
        int[] input = {2};
        boolean expected = false;
        boolean actual = Main.checkSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    void checkSequenceFour() {
        int[] input = {};
        boolean expected = false;
        boolean actual = Main.checkSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    void checkSequenceFive() {
        int[] input = {2, 2, 7};
        boolean expected = false;
        boolean actual = Main.checkSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    void checkSequenceSix() {
        int[] input = {2, 3, 5, 8};
        boolean expected = false;
        boolean actual = Main.checkSequence(input);
        assertEquals(expected, actual);
    }
}