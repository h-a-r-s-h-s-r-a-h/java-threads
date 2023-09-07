package Program11;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<CollableTask> tasks = List.of(new CollableTask("Jai Shree Ram"),new CollableTask("Jai Shyam"),new CollableTask("Har har mahadev"));
        List<Future<String>> results = executorService.invokeAll(tasks);
        for(Future<String> result:results){
            System.out.println(result.get());
        }
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