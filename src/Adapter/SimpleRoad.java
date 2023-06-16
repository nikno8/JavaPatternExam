package Adapter;

public class SimpleRoad implements Road{
    @Override
    public void run() {
        System.out.println("running on default road");
    }
}
