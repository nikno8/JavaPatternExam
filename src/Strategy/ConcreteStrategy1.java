package Strategy;

public class ConcreteStrategy1 implements Strategy{

    @Override
    public void doAction() {
        System.out.println("Выполняется действие стратегии 1");
    }
}
