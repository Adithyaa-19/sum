public class array1 {
    

    public static void main(String[] args) {
        int[] scores = {45, 72, 19, 88, 53};

        int min = scores[0];
        int max = scores[0];

        for (int score : scores) {
            if (score < min) min = score;
            if (score > max) max = score;
        }

        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
    }
}

