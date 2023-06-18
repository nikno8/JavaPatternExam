package ex_22;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Starting new thread...");
        NewThread newThread = new NewThread();
        newThread.start();
    }
}
