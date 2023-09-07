package Program10;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class CallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcomeFuture = executorService.submit(new CollableTask("Jai Shree Ram"));
        String msg = welcomeFuture.get();
        System.out.println(msg);
        executorService.shutdown();
    }
}
class CollableTask implements Callable<String>{
    private String name;
    CollableTask(String name){
        this.name = name;
    }
    public String call() throws Exception{
        Thread.sleep(1000);
        return name;
    }
}