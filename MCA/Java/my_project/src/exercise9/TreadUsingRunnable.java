package exercise9;

class GreetRunnable implements Runnable{
    public int time;
    public String message;
    public GreetRunnable(String message, int time){
        this.time = time;
        this.message = message;
    }
    @Override
    public void run() {
        while (true){
            System.out.println(message);
            try{
                Thread.sleep(time);
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class TreadUsingRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new GreetRunnable("Good Morning", 1000));
        Thread t2 = new Thread(new GreetRunnable("Hello", 2000));
        Thread t3 = new Thread(new GreetRunnable("Welcome", 3000));
        t1.start();
        t2.start();
        t3.start();
    }
}
