package com.bootdo.clouddocommon;

import java.util.concurrent.*;

/**
 * Created by zk on 2018/7/12.
 */
public class ThreadPool extends ThreadPoolExecutor {
    public ThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }


}
