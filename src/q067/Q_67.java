package q067;



class Caller {
    private void init() { //private cannot access
        System.out.println("Initialized");
    }

    private void start() {
        init();
        System.out.println("Started");
    }


}
public class Q_67 {
    public static void main(String[] args) {
        Caller c = new Caller();
    // c.start();
    //   c.init();
    }
}


//What is the result?
//A. An exception is thrown at runtime.
//B. InitializedStartedInitialized
//C. InitializedStarted
//D. Compilation fails.
//Answer: D

