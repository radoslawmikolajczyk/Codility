package Iterations.BinaryGapLesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static int solution(int N){
        String binary = Integer.toBinaryString(N);
        String [] strings = binary.split("1");
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        if (binary.charAt(binary.length()-1) == '1'){
            list.add("");
        }

        if (list.size() == 2 || list.size() == 0){
            return 0;
        }

        if (!list.get(list.size()-1).equals("")){
            list.remove(list.size()-1);
            list.add("");
        }

        int max = 0;
        for (String s : list){
            if (max <= s.length()){
                max = s.length();
            }
        }
        return max;
    }
    public static void main(String[] args) {


        System.out.println(solution(9));

    }
}
