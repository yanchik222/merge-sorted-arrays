public class Merge {

    // merge two SORTED arrays int one
    public static int[] merge(int[] A, int[] B) {

        //result array will hold all the elements from A to B
        int[] result = new int[A.length + B.length];

        //pointers for A, B, result respectfully
        int i = 0;
        int j = 0;
        int k = 0;

        //compare elements from both arrays
        while (i < A.length && j < B.length){
            if (A[i] <= B[j]){
                result[k] = A[i];
                i++;
            } else {
                result[k] = B[j];
                j++;
            }
            k++;
        }

        //copy the rest of the elements from A
        while (i < A.length){
            result[k] = A[i];
            i++;
            k++;
        }

        //copy the rest of the elements from B
        while (j < B.length){
            result[k] = B[j];
            j++;
            k++;
        }

        //return merged sorted array
        return result;
    }
}