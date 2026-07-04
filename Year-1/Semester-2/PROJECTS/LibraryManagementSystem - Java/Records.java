import java.util.ArrayList;

public class Records {
    ArrayList<Member> members = new ArrayList<>();

    public void addMember(String name, String occupation) {
        if (isMemberExist(name)) {
            System.out.println("Member Already Exist!");
        }
        else {
            Member addMember = new Member(name, occupation);
            members.add(addMember);
            System.out.println("Member Added!");
        }
    }

    public void viewMember() {
        if (members.size() == 0) {
            System.out.println("No Members Yet!");
            return;
        } 

        for (Member member : members) {
            System.out.println(member);
        }
    }

    public void searchMember(String memberId) {
        int i = 0;
        boolean isFound = false;

        for (i = 0; i < members.size(); i++) {
            if (members.get(i).getId().equalsIgnoreCase(memberId)) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println(members.get(i));
        }
        else {
            System.out.println("Member not Found!");
        }
    }

    public boolean isMemberExist(String name) {
        boolean isFound = false;
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equalsIgnoreCase(name)) {
                isFound = true;
            }
        }
        return isFound;
    }
}
