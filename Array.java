
public class Array {
    public static void main(String[] args) {
        int[] scores = {45, 72, 19, 88, 53};

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length;

        System.out.println("Sum of Scores: " + sum);
        System.out.println("Average Score: " + average);
    }
}