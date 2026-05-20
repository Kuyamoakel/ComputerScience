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

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}