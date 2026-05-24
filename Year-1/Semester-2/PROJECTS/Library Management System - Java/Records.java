import java.util.ArrayList;

public class Records {
    ArrayList<Member> members = new ArrayList<>();

    public void register(String name, String occupation) {

        if (nameChecking(name)) {
            Member addMember = new Member(name, occupation);
            members.add(addMember);
        }
    }
    public boolean nameChecking(String name) {
        boolean isExist = false;
        
        for(Member member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                return isExist = true;
            }
        }
        return isExist;
    }
}
