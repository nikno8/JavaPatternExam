package Adapter;

public class Runner {
    private Road road;

    public Runner(Road road) {
        this.road = road;
    }

    public Runner(){}

    public void runOnTheRoad() {
        System.out.println("Let's run");
        road.run();
        System.out.println("Finish");
    }

}
