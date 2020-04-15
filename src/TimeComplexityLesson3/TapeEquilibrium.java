package TimeComplexityLesson3;


import java.util.*;

public class TapeEquilibrium {

    public static int solution(int [] A){
        List<Integer> sumRight = new ArrayList<>();
        List<Integer> sumLeft = new ArrayList<>();

        Set<Integer> solutionsList = new TreeSet<>();

        int right = 0;
        int sum = 0;
        while (right < A.length - 1){
            sum+=A[right];
            sumRight.add(sum);
            right++;
        }

        int left = A.length - 1;
        sum = 0;
        while (left > 0){
            sum+=A[left];
            sumLeft.add(sum);
            left--;
        }
        Collections.reverse(sumLeft);

        for (int i = 0; i < sumLeft.size(); i++){
            int abs = Math.abs(sumRight.get(i) - sumLeft.get(i));
            solutionsList.add(abs);
        }

        return solutionsList.iterator().next();

    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,4,3}));
    }
}
