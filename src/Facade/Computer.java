package Facade;

public class Computer {
    private PowerSystem powerSystem;
    private Cpu cpu;
    private Ram ram;
    private HardDrive hardDrive;

    public Computer() {
        this.powerSystem = new PowerSystem();
        this.cpu = new Cpu();
        this.ram = new Ram();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        powerSystem.turnOn();
        cpu.start();
        ram.load();
        hardDrive.read();
    }

    public void shutdown() {
        hardDrive.write();
        ram.flush();
        cpu.stop();
        powerSystem.turnOff();
    }
}


//    Паттерн фасад (Facade) используется для упрощения интерфейса и управления сложными системами с помощью
//    создания более простого и понятного интерфейса для взаимодействия с системой.
//    Он предоставляет упрощенный интерфейс к сложным подсистемам, скрывая их внутреннюю сложность и структуру,
//    и предоставляет единую точку доступа для взаимодействия с ними.
//
//        Паттерн фасад может использоваться в следующих случаях:
//        - когда система имеет сложную структуру, и необходимо скрыть ее детали от пользователя
//        - когда необходимо уменьшить количество кода, управляющего системой,
//        и упростить интерфейс для удобства работы пользователя
//        - когда необходимо предоставить общий интерфейс для различных подсистем,
//        скрывая от пользователя детали их взаимодействия.
