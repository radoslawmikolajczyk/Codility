package CountingElementsLesson4;

import java.util.Arrays;

public class PermCheck {

    public static int solution(int[] A){
        A = Arrays.stream(A).sorted().toArray();
        if (A.length != Arrays.stream(A).max().getAsInt()){
            return 0;
        }

        if (Arrays.stream(A).min().getAsInt() != 1){
            return 0;
        }

        for (int i = 0; i < A.length-1; i++){
            if (A[i+1] - A[i] > 1){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{}));
    }
}
