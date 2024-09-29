package assigment10.assigment10;
import java.util.ArrayList;
import java.util.List;
public class ArrayFlattener {
    public static int[] flattenArray(int[][] input) {
        if (input == null) {
            return null;
        }

        List<Integer> flattened = new ArrayList<>();

        for (int[] subArray : input) {
            if (subArray != null) {
                for (int element : subArray) {
                    flattened.add(element);
                }
            }
        }

        return flattened.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] result = flattenArray(input);

        System.out.print("Flattened array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
