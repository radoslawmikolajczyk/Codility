package CountingElementsLesson4;

public class MaxCounters {

    public static int[] solution(int N, int[] A){
        int[] counter = new int[N];
        int n = A.length;
        int max=-1,current_min=0;

        for(int i=0;i<n;i++){
            if(A[i]>=1 && A[i]<= N){
                if(counter[A[i] - 1] < current_min)
                    counter[A[i] - 1] = current_min;

                counter[A[i] - 1] = counter[A[i] - 1] + 1;

                if(counter[A[i] - 1] > max)
                    max = counter[A[i] - 1];
            }
            else if(A[i] == N+1){
                current_min = max;
            }
        }
        for(int i=0;i<N;i++){
            if(counter[i] < current_min) counter[i] =  current_min;
        }
        return counter;
    }


    public static void main(String[] args) {

    }
}
