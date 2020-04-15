package TimeComplexityLesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PermMissingElem {

    public static int solution(int [] A){
        Set<Integer> integers = new TreeSet<>();
        for(int el: A){
            integers.add(el);
        }
        List<Integer> list = new ArrayList<>(integers);

        for (int i= list.size()-1; i > 0; i--){
            int sol = list.get(i) - list.get(i-1);
            if (sol == 2){
                int ex = list.get(i) + list.get(i-1);
                return ex/2;
            }
        }
        if (A.length==0) {
            return 1;
        } else if (A.length==1){
            return 2;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,3,1,5}));
    }
}
