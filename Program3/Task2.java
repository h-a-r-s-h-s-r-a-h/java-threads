package Program3;

public class Task2 implements Runnable{
    public void run(){
        System.out.println("Task2 Started");
        for(int i=1;i<=6;i++){
            System.out.print(i);
        }
        System.out.println("Task2 completed");
    }
}
