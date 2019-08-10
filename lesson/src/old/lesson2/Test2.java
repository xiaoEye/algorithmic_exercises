package old.lesson2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            Future<?> submit = executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Single.getSingle());
                }
            });
            submit.isDone();
            try {
                submit.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("result");
        executorService.shutdown();
    }
}
