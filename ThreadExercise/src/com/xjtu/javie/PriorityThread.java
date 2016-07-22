package com.xjtu.javie;

/**
 * Created by Javie on 16/5/18.
 */
public class PriorityThread {

    private static class HighPriority implements Runnable {
        private static int count = 0;

        @Override
        public void run() {
            while (true) {
                synchronized (PriorityThread.class) {
                    count++;
                    if (count > 1000 * 1000) {
                        System.out.println("HighPriority is complete");
                        break;
                    }
                }
            }
        }
    }

    private static class LowPriority implements Runnable{
        private static int count = 0;

        @Override
        public void run() {
            while (true) {
                synchronized (PriorityThread.class) {
                    count++;
                    if (count > 1000 * 1000) {
                        System.out.println("LowPriority is complete");
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread highThread = new Thread(new HighPriority());
        Thread lowThread = new Thread(new LowPriority());
        highThread.setPriority(Thread.MAX_PRIORITY);
        lowThread.setPriority(Thread.MIN_PRIORITY);

        lowThread.start();
        highThread.start();

    }
}
