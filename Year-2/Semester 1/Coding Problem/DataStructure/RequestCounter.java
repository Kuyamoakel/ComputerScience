import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RequestCounter {
    public static void main(String[] args) {
        
        var in = new Scanner(System.in);

        HashMap<String, Integer> request = new HashMap<>();

        while (true) {
            System.out.println("\n1. Request a song");
            System.out.println("2. View all request counts");
            System.out.println("3. Search for a song");
            System.out.println("4. Remove a song");
            System.out.println("5. Show most requested song");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            String menu = in.nextLine();

            switch(menu) {
                case "1":
                    System.out.print("Request: ");
                    String title = in.nextLine().toLowerCase();

                    request.put(title,
                        request.getOrDefault(title, 0) + 1
                    );
                    break;
                case "2":
                    if (request.isEmpty()) {
                        System.out.println("No requests yet.");
                        break;
                    }
                    System.out.println("All request:");
                    for (Map.Entry<String, Integer> requests : request.entrySet()) {
                        System.out.println(requests.getKey() + ": " + requests.getValue());
                    }
                    break;
                case "3":
                    System.out.println("Search for a song:");
                    System.out.print("Enter Title: ");
                    String songTitle = in.nextLine().toLowerCase();

                    if (request.containsKey(songTitle)) {
                        System.out.println("Found: " + request.get(songTitle));
                    } else {
                        System.out.println("Song not found.");
                    }
                    break;
                case "4":
                    System.out.println("Remove song:");
                    System.out.print("Enter Title: ");
                    String titleToRemove = in.nextLine().toLowerCase();

                    if (request.containsKey(titleToRemove)) {
                        request.remove(titleToRemove);
                        System.out.println("Succesfully Removed!");
                    } else {
                        System.out.println(titleToRemove + " Cannot Find!");
                    }
                    break;
                case "5":
                    if (request.isEmpty()) {
                        System.out.println("No requests yet.");
                        break;
                    }
                    String highestName = "";
                    int highestValue = Integer.MIN_VALUE;
                    for (Map.Entry<String, Integer> requests : request.entrySet()) {

                        if (requests.getValue() > highestValue) {
                            highestValue = requests.getValue();
                            highestName = requests.getKey();
                        }
                    }
                    System.out.println("Most requested:");
                    System.out.println(highestName + " - " + highestValue + " requests");
                    break;
                case "6":
                    System.out.println("babyes");
                    return;

            }
        }
    }
}