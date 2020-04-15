package TimeComplexityLesson3;

public class FrogJmp {

    public static int solution(int X, int Y, int D){
        if (X > Y){
            return 0;
        }

        int counter = 0;
        while (X < Y){
            X+=D;
            counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(solution(1,5,2));
    }
}
