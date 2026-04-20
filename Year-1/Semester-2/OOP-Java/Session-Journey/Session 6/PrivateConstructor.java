class PrivateConstructor {
    
    private PrivateConstructor() {
        System.out.println("private constructor");
    }

    void displayinfo() {
        System.out.println("Hello Private");
    }
}

class Main {
    public static void main(String[] args) {
        // this is error because it is a private constructor
        //PrivateConstructor pri = new PrivateConstructor();

        //pri.displayinfo(); not gonna work
    }
}
