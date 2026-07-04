class Member {
    private static int counter = 1000;
    private String id;
    private String name;
    private String occupation;

    public Member(String name, String occupation) {
        this.id = "EM" + counter++;
        this.name = name;
        this.occupation = occupation;
    }

    // getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    @Override
    public String toString() {
        return "Name: " + name +
               " | ID: " + id +
               " | Occupation: " + occupation;
    }
}