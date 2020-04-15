package PrefixSumsLesson5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class GenomicRangeQuery {

    public static int[] solution(String S, int[] P, int[] Q){
        int[] solution = new int[P.length];

        if (P.length != Q.length){
            return solution;
        } else if (P.length < 1 || P.length > 50_000){
            return solution;
        } else if (S.length() < 1 || S.length() > 100_000){
            return solution;
        } else if (!(S.contains("A") || S.contains("C") || S.contains("G") || S.contains("T"))){
            return solution;
        } else if (Arrays.stream(P).anyMatch(value -> value > S.length()-1)){
            return solution;
        } else if (Arrays.stream(Q).anyMatch(value -> value > S.length()-1)){
            return solution;
        }

        Map<Character, Integer> rules = new HashMap<>();
        rules.put('A',1);
        rules.put('C',2);
        rules.put('G',3);
        rules.put('T',4);

        for (int i = 0; i < P.length; i++){
            int pValue = P[i];
            for (int qValue : Q) {
                String str = S.substring(pValue, qValue + 1);
                int min = 4;
                for (int k = 0; k < str.length(); k++) {
                    if (rules.get(str.charAt(k)) <= min) {
                        min = rules.get(str.charAt(k));
                    }
                }
                solution[i] = min;
                break;
            }
        }

        return solution;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})));
    }
}
