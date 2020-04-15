package PrefixSumsLesson5;


import java.util.ArrayList;
import java.util.List;

public class MinAvgTwoSlice {

    public static int solution(int[] A){
        if (A.length < 2 || A.length > 100_000){
            return -1;
        }

        List<Integer> minAvg = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();
        int sum = 0;
        int minSliceIndex = 0;

        for (int i = 0; i < A.length; i++){
            for (int j = i+1; j < A.length;j++){
                sum += A[i] + A[j];
                minAvg.add(sum/(j-i+1));
                indexes.add(i);
            }
            sum = 0;
        }
        int minimum = minAvg.get(0);
        for (int i = 0; i < minAvg.size(); i++){
            if (minimum >= minAvg.get(i)){
                minimum = minAvg.get(i);
                minSliceIndex = indexes.get(i);
            }
        }

        return  minSliceIndex;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,2,2,5,1,5,8}));
    }
}
