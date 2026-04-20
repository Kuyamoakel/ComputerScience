import java.util.Scanner;

public class User {
    private String username;
    private String password;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public boolean login(String inputUsername, String Inputpassword) {
        return username.equalsIgnoreCase(inputUsername) && 
        password.equalsIgnoreCase(Inputpassword);
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maximumAttempts = 0;

        User login1 = new User("Akel", "1234");


do {
        System.out.print("Enter Username: ");
        String userNameInput = in.nextLine();

        System.out.print("Enter Password: ");
        String passwordInput = in.nextLine();
        maximumAttempts++;

        if (!login1.login(userNameInput, passwordInput)) {
            System.out.println("Wrong!");
            continue;
        } 
        if (login1.login(userNameInput, passwordInput)) {
            System.out.println("Welcome to your Account!");
            break;
        }
        
        if (maximumAttempts == 3) {
            System.out.println("You've Reached your maximum attempts");
            break;
        } 

        
        } while (true);

    }
}
