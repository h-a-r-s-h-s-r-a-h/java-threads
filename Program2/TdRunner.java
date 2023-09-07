package Program2;

public class TdRunner {
    public static void main(String[] args) {
        Task1 def = new Task1();
        Thread thread1 = new Thread(def);
        thread1.start();
        Task2 de = new Task2();
        Thread thread2 = new Thread(de);
        thread2.start();

    }
}
    