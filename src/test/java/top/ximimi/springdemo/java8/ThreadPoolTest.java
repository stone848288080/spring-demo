package top.ximimi.springdemo.java8;

import org.junit.jupiter.api.Test;
import java.util.concurrent.*;

public class ThreadPoolTest {
    @Test
    void testFixThreadPool() {
        ExecutorService e1 = Executors.newFixedThreadPool(8);
        ExecutorService e2 = Executors.newCachedThreadPool();
        ExecutorService e3 = Executors.newSingleThreadExecutor();
        //customized Thread pool
        ExecutorService customizedPool = new ThreadPoolExecutor(
                3,
                8,
                3,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                new ThreadPoolExecutor.AbortPolicy()
        );
    }
}
