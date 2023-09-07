package Program7;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService exeservice = Executors.newSingleThreadExecutor();
        exeservice.execute(new Task1());
        exeservice.execute(new Thread(new Task2()));
        exeservice.shutdown();
    }
}
class Task1 extends Thread{
    public void run(){
        for(int i=0;i<4;i++){
            System.out.println(i);
        }
    }
}
class Task2 implements Runnable{
    public void run(){
        for(int i=11;i<15;i++){
            System.out.println(i);
        }
    }
}