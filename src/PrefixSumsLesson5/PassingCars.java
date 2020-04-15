package PrefixSumsLesson5;

import java.util.Arrays;

public class PassingCars {

    public static int solution(int [] A){
        if (A.length < 1 || A.length > 100_000){
            return -1;
        }
        if(Arrays.stream(A).anyMatch(value -> !(value == 0 || value == 1))){
            return -1;
        }


        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0,1,0,1,1}));
    }
}
