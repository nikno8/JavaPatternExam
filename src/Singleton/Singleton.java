package Singleton;

public class Singleton {
    private static Singleton instance;


    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

//  Одиночка (Singleton, Синглтон) - порождающий паттерн, который гарантирует, что для определенного класса
//будет создан только один объект, а также предоставит к этому объекту точку доступа.
//  Когда надо использовать Синглтон? Когда необходимо, чтобы для класса существовал только один экземпляр
//  Синглтон позволяет создать объект только при его необходимости.
//  Если объект не нужен, то он не будет создан. В этом отличие синглтона от глобальных переменных.