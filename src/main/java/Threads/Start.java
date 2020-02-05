package Threads;

public class Start {
    public static void main(String[] args) {
        Threads threads = new Threads();
       threads.start();
//        threads.run();
        Threads threads1 = new Threads();
        threads1.start();
//       threads1.run();
    }
}
