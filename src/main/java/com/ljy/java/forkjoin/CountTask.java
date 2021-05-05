package com.ljy.java.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * RecursiveTask:用于有返回结果的任务
 * RecursiveAction:用于没有返回结果的任务
 */
public class CountTask extends RecursiveTask<Integer> {

    private static final int THRESHOLD = 2; //阈值

    private int start;
    private int end;

    public CountTask(int start, int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    protected Integer compute() {
        int sum = 0;
        boolean canCompute = (end - start) <= THRESHOLD;

        //如果任务足够小就计算任务
        if (canCompute) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            //如果任务大于阈值，就分裂成2个子任务
            int mid = (start + end) / 2;
            CountTask leftTask = new CountTask(start, mid);
            CountTask rightTask = new CountTask(mid + 1, end);
            //执行子任务
            leftTask.fork();
            rightTask.fork();
            //等待子任务，并获取返回结果
            Integer leftJoin = leftTask.join();
            Integer rightJoin = rightTask.join();
            //合并子任务
            sum = rightJoin + leftJoin;
        }
        return sum;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        CountTask countTask = new CountTask(1, 10000);

//        boolean completedAbnormally = countTask.isCompletedAbnormally();  查看任务是否正常执行

        ForkJoinTask<Integer> submit = forkJoinPool.submit(countTask);
        Integer result = submit.get();
        System.out.println(result);
    }
}
