package ArraysLesson2.CyclicRotation;

import java.util.Arrays;

public class CyclicRotation {

    public static int[] solution(int[] A, int K) {

        int [] tab = new int[A.length];
        if (K >= tab.length){
            K -= tab.length;
        }

        if (K == 0){
            return A;
        }
        int size = A.length;
        int j = 0;
        for (int i = 0; i < size; i++){
            if (size - K + i >= size){
                tab[i] = A[j++];
            } else {
                tab[i] = A[size - K + i];
            }
        }

        return tab;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 8, 9, 7}, 2)));

    }
}
