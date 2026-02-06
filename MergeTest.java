import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class MergeTest{
//I ASSUME THAT ALL ARRAYS ARE SORTED, OTHERWISE IT WILL FAIL THE TEST!

    // test when both arrays have equal # sorted elements
    @Test
    public void equal() {
        int[] A = {2, 7, 8,};
        int[] B = {1, 5, 6,};

        int[] needed = {1, 2, 5, 6, 7, 8};
        int [] completed = Merge.merge(A, B);

        assertArrayEquals(needed, completed);
    }

    // test when one array is empty
    @Test
    public void notEqual() {
        int[] A = {2, 7, 8,};
        int[] B = {1};

        int[] needed = {1, 2, 7, 8};
        int [] completed = Merge.merge(A, B);

        assertArrayEquals(needed, completed);
    }

    // test when have duplicates
    @Test
    public void duplicates() {
        int[] A = {2, 7, 8,};
        int[] B = {2, 3, 4};

        int[] needed = {2, 2, 3, 4, 7, 8};
        int [] completed = Merge.merge(A, B);

        assertArrayEquals(needed, completed);
    }

    //test when both arrays are empty
    @Test
    public void empty() {
        int[] A = {};
        int[] B = {};

        int[] needed = {};
        int [] completed = Merge.merge(A, B);

        assertArrayEquals(needed, completed);
    }

    //test when one array is empty and the other one is sorted
    @Test
    public void partilyEmpty() {
        int[] A = {2, 7, 8};
        int[] B = {};

        int[] needed = {2, 7, 8};
        int [] completed = Merge.merge(A, B);

        assertArrayEquals(needed, completed);
    }
}
