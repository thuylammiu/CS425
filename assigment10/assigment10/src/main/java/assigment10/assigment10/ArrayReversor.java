package assigment10.assigment10;
import java.util.Arrays;
import java.util.Collections;
public class ArrayReversor {
    private ArrayFlattenerService flattenerService;

    public ArrayReversor(ArrayFlattenerService flattenerService) {
        this.flattenerService = flattenerService;
    }

    public int[] reverseArray(int[][] input) {
        // Always call the flattenerService, even if input is null
        int[] flattened = flattenerService.flattenArray(input);

        if (flattened == null) {
            return null;
        }

        // Reverse the flattened array
        for (int i = 0; i < flattened.length / 2; i++) {
            int temp = flattened[i];
            flattened[i] = flattened[flattened.length - 1 - i];
            flattened[flattened.length - 1 - i] = temp;
        }

        return flattened;
    }


}
