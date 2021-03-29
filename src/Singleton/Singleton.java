package Singleton;

public class Singleton {
    private String name;
    private volatile static Singleton singleton = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public String getName() {
        return name;
    }
}
