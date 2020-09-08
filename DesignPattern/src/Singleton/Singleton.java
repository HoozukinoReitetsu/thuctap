package DesignPattern.src.Singleton;

public class Singleton {
        private static Singleton instance=new Singleton();
        private Singleton(){}
        public static Singleton getIntance(){
            return instance;
        }
}
