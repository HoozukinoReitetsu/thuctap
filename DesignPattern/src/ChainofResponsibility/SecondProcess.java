package DesignPattern.src.ChainofResponsibility;

public class SecondProcess extends Process {
    protected void RunNext() {
        try {
            // thread to sleep for 1000 milliseconds
            System.out.println(" Beginning second process ....  ");
            Thread.sleep(1000);
            System.out.println(" Ending second process ....  ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}