package AbstractFabric;

public class ColorFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {

        if(colorType == null){
            return null;
        }

        if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        }
        else if(colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        }

        return null;
    }
}
