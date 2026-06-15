package exercise9;

class GreetingThread extends Thread{
    public int time;
    public String message;
    public GreetingThread(String message, int time){
        this.time = time;
        this.message = message;
    }
    @Override
    public void run() {
        while (true){
            System.out.println(message);
            try{
                this.sleep(time);
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class TreadProgramming {
    public static void main(String[] args) {
        GreetingThread gt1 = new GreetingThread("Good Morning", 1000);
        GreetingThread gt2 = new GreetingThread("Hello", 2000);
        GreetingThread gt3 = new GreetingThread("Welcome", 3000);
        gt1.start();
        gt2.start();
        gt3.start();
    }
}
