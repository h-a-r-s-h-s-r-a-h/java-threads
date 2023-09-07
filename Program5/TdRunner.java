package Program5;

public class TdRunner {
    public static void main(String[] args) throws InterruptedException {
        Task1 def = new Task1();
        Thread thread1 = new Thread(def);
        thread1.setPriority(1);
        thread1.start();
        thread1.join();
        Task2 de = new Task2();
        Thread thread2 = new Thread(de);
        thread2.setPriority(10);
        Thread.sleep(1000);
        thread2.start();

    }
}
