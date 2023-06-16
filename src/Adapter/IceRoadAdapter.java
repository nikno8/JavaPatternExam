package Adapter;

public class IceRoadAdapter implements Road{
    private IceRoad road;

    public IceRoadAdapter() {
        road = new IceRoad();
    }

    @Override
    public void run() {
        road.walk();
    }
}
