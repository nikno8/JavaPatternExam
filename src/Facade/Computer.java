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
