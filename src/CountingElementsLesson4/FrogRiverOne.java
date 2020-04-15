package CountingElementsLesson4;


import java.util.ArrayList;
import java.util.List;

public class FrogRiverOne {

    public static int solution(int X, int[] A){
        List<Integer> leavesList = new ArrayList<>();
        for (Integer i: A){
            leavesList.add(i);
        }

        if(!leavesList.contains(X)){
            return -1;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < X; i++){
            list.add(i+1);
        }

        int index = 0;
        if (!leavesList.containsAll(list)){
            return -1;
        } else {
            List<Integer> solution = new ArrayList<>();
            for (int i = 0; i < A.length; i++){
                solution.add(A[i]);
                if (solution.containsAll(list)){
                    index = i;
                    break;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println(solution(5,new int[]{1,3,1,4,2,3,5,4}));
    }
}
