package CountingElementsLesson4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingInteger {

    public static int solution(int[] A){
        IntStream b = Arrays.stream(A).sorted();
        A = b.toArray();

        if (A.length > 100_000)
            return 1;

        if (A.length == 1){
            return 2;
        }

        if (Arrays.stream(A).max().getAsInt() < 0){
            return 1;
        }
        for (int i = 1; i < A.length ; i++){
            if (A[i] - A[i-1] == 2){
                return (A[i] + A[i-1])/2;
            }
        }

        return Arrays.stream(A).max().getAsInt()+1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1,-3}));
    }
}
