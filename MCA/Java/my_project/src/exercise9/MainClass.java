package exercise9;

class SharedMemory{
    private static int mem = 100;

    public static synchronized void setMem(int mem) {
        SharedMemory.mem = mem;
    }

    public static synchronized int getMem() {
        return mem;
    }
}

class TestThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            SharedMemory.setMem(i);
            System.out.println(Thread.currentThread().getName()+" -> "+SharedMemory.getMem());
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        t1.start();
        t2.start();
    }
}
