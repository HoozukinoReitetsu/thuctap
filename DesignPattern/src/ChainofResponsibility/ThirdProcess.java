package DesignPattern.src.ChainofResponsibility;

public class ThirdProcess extends Process {
    protected void RunNext() {
        try {
            // thread to sleep for 1000 milliseconds
            System.out.println(" Beginning third process ....  ");
            Thread.sleep(1000);
            System.out.println(" Ending third process ....  ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
