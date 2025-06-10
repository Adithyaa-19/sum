// Array.java: Computes sum, average, max, and min
public class Array {
    public static void main(String[] args) {
        int[] scores = {45, 72, 19, 88, 53};

        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int score : scores) {
            sum += score;
            if (score > max) max = score;
            if (score < min) min = score;
        }

        double average = (double) sum / scores.length;

        System.out.println("Sum of Scores: " + sum);
        System.out.println("Average Score: " + average);
        System.out.println("Maximum Score: " + max);
        System.out.println("Minimum Score: " + min);
    }
}