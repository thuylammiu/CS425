package assigment10.assigment10;
import java.util.ArrayList;
import java.util.List;
public class MockArrayFlattenerService implements ArrayFlattenerService{
    private boolean wasInvoked = false;

    @Override
    public int[] flattenArray(int[][] array) {
        wasInvoked = true;
        if (array == null) {
            return null;
        }

        List<Integer> flattened = new ArrayList<>();
        for (int[] subArray : array) {
            if (subArray != null) {
                for (int element : subArray) {
                    flattened.add(element);
                }
            }
        }

        return flattened.stream().mapToInt(Integer::intValue).toArray();
    }

    public boolean wasInvoked() {
        return wasInvoked;
    }

    public void reset() {
        wasInvoked = false;
    }
}
