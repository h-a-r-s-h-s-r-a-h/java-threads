package Program2;

public class Task1 implements Runnable{
    @Override
    public void run(){
        System.out.println("Task1 Started");
        for(int i=0;i<=5;i++){
            System.out.print(i);
        }
        System.out.println("Task1 completed");
        System.out.println();
    }
}
