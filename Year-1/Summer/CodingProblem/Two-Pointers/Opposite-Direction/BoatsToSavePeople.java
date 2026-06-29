import java.util.Arrays;

public class BoatsToSavePeople {

    public static void main(String[] args) {

        int[] people = {3, 2, 2, 1};
        int limit = 3;

        System.out.println(numberOfResueBoats(people, limit));

    }

    static int numberOfResueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {

            if (people[left] + people[right] <= limit) {
                right--;
                left++;
            }
            else {
                right--;
            }

            boats++;
        }

        return boats;
        
    } 
}