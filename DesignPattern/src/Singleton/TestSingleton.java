package DesignPattern.src.Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getIntance();
        Singleton instance2 = Singleton.getIntance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
