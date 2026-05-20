public class Grade {
    public static void main(String[] args) {

        int[] scores = {55, 60, 50};

        System.out.println(getLetterGrade(scores));
    }

    public static String getLetterGrade(int[] scores) {
        double sum = 0;

        for (int score : scores) {
            sum += score;
        }

        double average = sum / scores.length;
        return average > 90 ? "A" : average > 80 ? "B" : average > 70 ? "C" : average > 60 ? "D" : "F";
    }
}