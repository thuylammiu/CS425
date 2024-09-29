package assigment10.assigment10;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ArrayReversotTestCases {
    private ArrayReversor arrayReversor;
    private MockArrayFlattenerService mockService;

    @BeforeEach
    void setUp() {
        mockService = new MockArrayFlattenerService();
        arrayReversor = new ArrayReversor(mockService);
    }

    @Test
    void testReverseArrayWithValidInput() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expected = {9, 5, 4, 0, 3, 1};

        int[] result = arrayReversor.reverseArray(input);

        assertArrayEquals(expected, result);
        assertTrue(mockService.wasInvoked(), "ArrayFlattenerService should have been invoked");
    }

    @Test
    void testReverseArrayWithNullInput() {
        int[] result = arrayReversor.reverseArray(null);

        assertNull(result);
        assertTrue(mockService.wasInvoked(), "ArrayFlattenerService should have been invoked even with null input");
    }
}
