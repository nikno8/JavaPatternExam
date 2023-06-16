package Adapter;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner(new IceRoadAdapter()); // с паттерном
        Runner runner1 = new Runner(new SimpleRoad()); // без паттерна
        runner.runOnTheRoad();
        runner1.runOnTheRoad();
    }
}
