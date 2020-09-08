package DesignPattern.src.ChainofResponsibility;

public class TestChaino {
    public static void main(String[] args) {
        Process firstProcess = new FirstProcess();
        Process secondProcess = new SecondProcess();
        Process thirdProcess = new ThirdProcess();
        thirdProcess.SetNextProcess(null);
        secondProcess.SetNextProcess(thirdProcess);
        firstProcess.SetNextProcess(secondProcess);           
        firstProcess.Run();
    }
}
