package ArraysLesson2.OddOccurrencesInArray;

import java.util.ArrayList;
import java.util.List;

public class OddOccurrencesInArray {

    public static int solution(int [] tab){
        if(tab.length%2==0){
            return -1;
        }

        List<Integer> indexList = new ArrayList<>();

        int result = 0;

        for (int i = 0; i < tab.length; i++){
            for (int j = 1; j < tab.length; j++){
                if (tab[i] == tab[j] && i!=j){
                    indexList.add(tab[i]);
                    indexList.add(tab[j]);
                    break;
                }
            }
        }

        for (int i = 0; i < tab.length; i++){
            if (!indexList.contains(tab[i])){
                result = tab[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{9,3,9,3,9,7,9}));
    }
}
