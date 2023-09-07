package Program9;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService exeservice = Executors.newFixedThreadPool(5);
        exeservice.execute(new Task(1));
        exeservice.execute(new Task(2));
        exeservice.execute(new Task(3));
        exeservice.shutdown();
    }
}
class Task extends Thread{
    private int number;
    Task(int no){
        this.number = no;
    }
    public void run(){
        System.out.println("Task"+number+" Started");
        for(int i=number*100;i<(number*100 + 10);i++){
            System.out.println(i);
        }
        System.out.println("Task"+number +" Completed");

    }
}