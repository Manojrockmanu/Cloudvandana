import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class ArrayShuffle {

    public List<Integer> shuffleArray(int[] arr) {
        List<Integer> l1 = new ArrayList<Integer>();
        for (int i : arr) {
            l1.add(new Integer(i));
        }
        Collections.shuffle(l1);
        return l1;

    }

    public static void main(String[] main) {
        int[] numValues = { 1, 2, 3, 4, 5, 6, 7 };
        List<Integer> l1 = new ArrayShuffle().shuffleArray(numValues);
        System.out.println(l1);
    }
}