package DesignPattern.src.Factory;

public class TestFactory {
    public static void main(String[] args) {
        Computer laptop = ComputerFactory.getComputer("Laptop", "2 GB", "500 GB", "2.4 GHz");
        Computer pc = ComputerFactory.getComputer("PC", "16 GB", "1 TB", "2.9 GHz");
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + laptop);

    }
}
