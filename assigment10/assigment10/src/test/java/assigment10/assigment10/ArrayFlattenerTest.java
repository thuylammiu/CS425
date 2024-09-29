package assigment10.assigment10;
import org.junit.Test;
import static org.junit.Assert.*;
public class ArrayFlattenerTest {
    @Test
    public void testFlattenArrayWithValidInput() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expected = {1, 3, 0, 4, 5, 9};
        assertArrayEquals(expected, ArrayFlattener.flattenArray(input));
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        assertNull(ArrayFlattener.flattenArray(null));
    }
}
