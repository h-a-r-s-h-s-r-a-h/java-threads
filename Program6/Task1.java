package Program6;

public class Task1 implements Runnable{
    public void run(){
        synchronized(this){
            for(int i=0;i<3;i++){
               System.out.println(i);
            }
        }
    }
}
