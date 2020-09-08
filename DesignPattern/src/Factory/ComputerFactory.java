package DesignPattern.src.Factory;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equals(type))
            return new PC(ram, hdd, cpu);
        else if ("Laptop".equals(type))
            return new Laptop(ram, hdd, cpu);
        return null;
    }
}
