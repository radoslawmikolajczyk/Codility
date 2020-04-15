package PrefixSumsLesson5;

public class CountDiv {

    public static int solution(int A, int B, int K){
        if(B < A || (A < 0 && B < 0) || K < 1){
            return 0;
        }
        int counter = 0;
        int i = A;
        while (A<=i && i <= B){
            if (i%K == 0){
                counter++;
            }
            i++;
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(solution(6,11,2));
    }
}
