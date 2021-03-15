import java.util.Arrays;
import java.util.Collections;

public class ReverzniNiz {
    public static void main(String[] args) {
        Integer[] niz = new Integer[]{1, 4, 4, 2, 5, -3, 6, 2, 4, 4, 2, 5, -3, 6, 2, 4, 4, 2, 5, -3, 6, 2, 4, 4, 2, 5, -3, 6, 2};
        Arrays.sort(niz);
        //Collections.reverse<niz>;

        // Arrays.parallelSort(niz);

        for (int broj : niz) {
            System.out.print(broj + " ");
        }
    }

}
